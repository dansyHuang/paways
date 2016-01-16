package org.pways.website.service.question;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.pways.website.entity.PawaysQuestion;
import org.pways.website.repository.PawaysQuestionDao;
import org.pways.website.service.account.PawaysShiroDbRealm.ShiroUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.utils.DateProvider;

/**
 * 用户管理类.
 * 
 * @author calvin
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class PwaysQuestionService {

	private PawaysQuestionDao pawaysQuestionDao;
	private DateProvider dateProvider = DateProvider.DEFAULT;
	@Autowired
	public void setPawaysQuestionDao(PawaysQuestionDao pawaysQuestionDao) {
		this.pawaysQuestionDao = pawaysQuestionDao;
	}
	
	public void saveQuestion(PawaysQuestion question){
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		question.setCreator(user.getLoginName());
		question.setModifier(user.getLoginName());
		question.setAuthorId(user.getLoginName());
		question.setGmtCreate(this.dateProvider.getDate());
		question.setGmtModified(this.dateProvider.getDate());
		this.pawaysQuestionDao.save(question);
	}

	public List<PawaysQuestion> findByLoginId(){
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		return this.pawaysQuestionDao.findWaiting(user.getLoginName());
	}
	public void setDateProvider(DateProvider dateProvider) {
		this.dateProvider = dateProvider;
	}
	
	
}
