package org.pways.website.web.account;

import java.util.List;

import org.pways.website.entity.PwsOrg;
import org.pways.website.service.account.AccountService;
import org.pways.website.service.geography.GeographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springside.modules.mapper.JsonMapper;

/**
 * 
 * @author Dansy
 */
@Controller
@RequestMapping(value = "/user/register")
public class RegisterController {

	@Autowired
	private AccountService accountService;
	
	private JsonMapper mapper = new JsonMapper();
	@Autowired
	private GeographyService geographyService;

	public void setGeographyService(GeographyService geographyService) {
		this.geographyService = geographyService;
	}
	@RequestMapping(method = RequestMethod.GET)
	public String registerForm(Model model) {
		List<PwsOrg> list = this.geographyService.getCityByPid("100000");
		model.addAttribute("provinces", list);
		return "paways/register";
	}


	/**
	 * Ajax请求校验loginName是否唯一。
	 */
	@RequestMapping(value = "checkLoginName")
	@ResponseBody
	public String checkLoginName(@RequestParam("loginId") String loginId) {
		if (accountService.findUserByLoginName(loginId) == null) {
			return "true";
		} else {
			return "false";
		}
	}
}
