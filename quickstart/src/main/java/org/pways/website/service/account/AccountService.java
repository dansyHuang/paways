package org.pways.website.service.account;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.pways.website.entity.PawaysPermission;
import org.pways.website.entity.PawaysUserLogin;
import org.pways.website.entity.PawaysUserRole;
import org.pways.website.repository.PawaysPermissionDao;
import org.pways.website.repository.PawaysUserRoleDao;
import org.pways.website.repository.PawaysUserStuDao;
import org.pways.website.service.account.PawaysShiroDbRealm.ShiroUser;
import org.pways.website.vo.PawsUserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.security.utils.Digests;
import org.springside.modules.utils.DateProvider;
import org.springside.modules.utils.Encodes;

/**
 * 用户管理类.
 * 
 * @author hlj
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class AccountService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(AccountService.class);

	private PawaysUserStuDao pawaysUserStuDao;
	private DateProvider dateProvider = DateProvider.DEFAULT;
	private PawaysUserRoleDao pawaysUserRoleDao;
	private PawaysPermissionDao pawaysPermissionDao;
	public List<PawaysUserLogin> getAllUser() {
		return (List<PawaysUserLogin>) pawaysUserStuDao.findAll();
	}

	public PawaysUserLogin getPawaysUserStu(Long id) {
		return pawaysUserStuDao.findOne(id);
	}

	public PawaysUserLogin findUserByLoginName(String loginName) {
		return pawaysUserStuDao.findByLoginId(loginName);
	}

	public List<PawaysUserRole> findByLoginId(String loginId){
		return this.pawaysUserRoleDao.findByLoginId(loginId);
	}
	
	public void registerUser(PawsUserVo userVo) {
		PawaysUserLogin user =new PawaysUserLogin();
		user.setGmtCreate(this.dateProvider.getDate());
		user.setGmtModified(this.dateProvider.getDate());
		user.setCreator(user.getLoginId());
		user.setModifier(user.getLoginId());
		user.setAge(userVo.getAge());
		user.setGender(userVo.getGender());
		user.setHometow(userVo.getHomeTown());
		user.setIdCard(userVo.getIdCard());
		user.setMobileNum(userVo.getMobileNum());
		user.setName(userVo.getName());
		user.setRoleName(userVo.getRoleName());
		user.setPassword(userVo.getUserPassword());
		user.setImgPath(userVo.getImgPath());
		user.setLoginId(userVo.getLoginId());
		entryptPassword(user);
		pawaysUserStuDao.save(user);
	}
	/*** 
     * 通过用户名获取权限资源 
     *  
     * @param username 
     * @return 
     */  
    public List<String> getPermissionsByUserName(String loginId,String roleName) {  
        PawaysUserLogin user = pawaysUserStuDao.findByLoginId(loginId);  
        if (user == null) {  
            return null;  
        }  
        List<String> list = new ArrayList<String>();  
        for (PawaysUserRole userRole : user.getPawaysUserRole()) {  
        	if(!userRole.getPawaysRole().getRoleName().equals(roleName))continue;
            List<PawaysPermission> permissions = pawaysPermissionDao.findByRoleName(userRole.getPawaysRole().getRoleName());  
            for (PawaysPermission p : permissions) {  
                list.add(p.getResource());  
            }  
        }  
        return list;  
    }  
  
	//注册时检查登录帐号是否重复
	public boolean checkUserExists(String loginId){
		PawaysUserLogin pawaysUserLogin=pawaysUserStuDao.findByLoginId(loginId);
		return null!=pawaysUserLogin;
	}
	public void updateUser(PawaysUserLogin user) {
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		pawaysUserStuDao.save(user);
	}

	public void deleteUser(Long id) {
		if (isSupervisor(id)) {
			logger.warn("操作员{}尝试删除超级管理员用户", getCurrentUserName());
			//throw new ServiceException("不能删除超级管理员用户");
		}
		pawaysUserStuDao.delete(id);
	}

	/**
	 * 判断是否超级管理员.
	 */
	private boolean isSupervisor(Long id) {
		return id == 1;
	}

	/**
	 * 取出Shiro中的当前用户LoginName.
	 */
	private String getCurrentUserName() {
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		return user.loginName;
	}

	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 */
	private void entryptPassword(PawaysUserLogin user) {
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		user.setSalt(Encodes.encodeHex(salt));
		user.setPlainPassword(user.getPassword());
		byte[] hashPassword = Digests.sha1(user.getPlainPassword().getBytes(), salt, HASH_INTERATIONS);
		user.setPassword(Encodes.encodeHex(hashPassword));
	}

	
	@Autowired
	public void setPawaysUserStuDao(PawaysUserStuDao pawaysUserStuDao) {
		this.pawaysUserStuDao = pawaysUserStuDao;
	}
	
	
	@Autowired
	public void setPawaysUserRoleDao(PawaysUserRoleDao pawaysUserRoleDao) {
		this.pawaysUserRoleDao = pawaysUserRoleDao;
	}

	public void setDateProvider(DateProvider dateProvider) {
		this.dateProvider = dateProvider;
	}
}
