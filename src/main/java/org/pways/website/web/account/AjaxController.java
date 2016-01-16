package org.pways.website.web.account;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.pways.website.constant.PawaysConstants;
import org.pways.website.entity.PwsOrg;
import org.pways.website.entity.District;
import org.pways.website.entity.PawaysQuestion;
import org.pways.website.service.account.AccountService;
import org.pways.website.service.geography.GeographyService;
import org.pways.website.service.question.PwaysQuestionService;
import org.pways.website.vo.PawsUserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springside.modules.mapper.JsonMapper;


/**
 * LoginController负责打开登录页面(GET请求)和登录出错页面(POST请求)，
 * 
 * 真正登录的POST请求由Filter完成,
 * 
 * @author dansy
 */
@Controller
public class AjaxController {
	
	private final static Logger logger = LoggerFactory.getLogger(AjaxController.class); 

	private JsonMapper mapper = new JsonMapper();
	@Autowired
	private GeographyService geographyService;
	@Autowired
	private AccountService accountService;
	public void setPwaysQuestionService(PwaysQuestionService pwaysQuestionService) {
		this.pwaysQuestionService = pwaysQuestionService;
	}
	@Autowired
	private PwaysQuestionService pwaysQuestionService;
	
	public void setGeographyService(GeographyService geographyService) {
		this.geographyService = geographyService;
	}

 
	@RequestMapping(value = "/geo/city", produces = "applicaiton/javascript")
	@ResponseBody
	public String execute(@RequestParam("parentId") String parentId) {
		List<PwsOrg> citys=this.geographyService.getCityByPid(parentId);
		return mapper.toJson(citys);
	}
	@RequestMapping(value = "/geo/district", produces = "applicaiton/javascript")
	@ResponseBody
	public String obtaincity(@RequestParam("parentId") String parentId) {
		List<PwsOrg> citys=this.geographyService.getCityByPid(parentId);
		return mapper.toJson(citys);
	}
	@RequestMapping(value = "/question/save", produces = "applicaiton/javascript")
	@ResponseBody
	public String submitQuestion(@Valid String question, HttpServletRequest request) {
		String srcImgCode=(String) request.getSession().getAttribute("imgCode");
		String descImgCode=request.getParameter("imgCode");
		if(!srcImgCode.equalsIgnoreCase(descImgCode)){
			return mapper.toJson("验证码错误!");
		}
		PawaysQuestion pawaysQuestion=mapper.fromJson(question, PawaysQuestion.class);
		pawaysQuestion.setStatus("waiting");
		this.pwaysQuestionService.saveQuestion(pawaysQuestion);
		return mapper.toJson("保存成功");
	}
	@RequestMapping(value = "/user/register", produces = "applicaiton/javascript")
	@ResponseBody
	public String register(@RequestParam("registerParam") String registerParam){
		PawsUserVo user=mapper.fromJson(registerParam, PawsUserVo.class);
		try{
			if(!checkUserName(user.getLoginId())){
				this.accountService.registerUser(user);
			}else{
				return mapper.toJson("用户名已存在");
			}
		}catch(Exception e){
			logger.error("AjaxController register",e);
			return mapper.toJson("注册失败");
		}
		return mapper.toJson("注册成功");
	}
	private boolean checkUserName(String loginId){
		return this.accountService.checkUserExists(loginId);
	}
	
	
}
