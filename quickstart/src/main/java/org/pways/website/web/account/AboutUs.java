package org.pways.website.web.account;

import org.pways.website.service.account.AccountService;
import org.pways.website.service.geography.GeographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springside.modules.mapper.JsonMapper;

/**
 * 用户注册的Controller.
 * 
 * @author calvin
 */
@Controller
@RequestMapping(value = "/aboutus")
public class AboutUs {

	/*@Autowired
	private AccountService accountService;
	
	private JsonMapper mapper = new JsonMapper();
	@Autowired
	private GeographyService geographyService;

	public void setGeographyService(GeographyService geographyService) {
		this.geographyService = geographyService;
	}
	@RequestMapping(method = RequestMethod.GET)
	public String question(Model model) {
		return "paways/aboutus";
	}*/
}
