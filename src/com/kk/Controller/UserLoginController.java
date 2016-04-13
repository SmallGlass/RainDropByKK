package com.kk.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kk.Service.IAuthUserService;
import com.kk.model.AuthUser;

@Controller
public class UserLoginController {
	@Resource(name="authUserService")
	public IAuthUserService authUserService;
	
	@RequestMapping("/login")
	public ModelAndView UserLogin() {
			// TODO Auto-generated method stub
		   AuthUser user =new AuthUser();
		  // user.setId("2");
		   user.setLoginName("ÄãºÃ");
		   user.setName("ÊÇÂð");
		   user.setPassword("123456");
		  // authUserService.add(user);
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("/check")
	public ModelAndView checkLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
			// TODO Auto-generated method stub
		 System.out.println(username);
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
}
