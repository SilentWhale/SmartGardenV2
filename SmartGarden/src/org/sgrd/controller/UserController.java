package org.sgrd.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.sgrd.domain.User;
import org.sgrd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class UserController {
	
	
	//注入块--------------------------------------------------

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	
	
	
	
	//UserController寻径块----------------------------------
	@RequestMapping("/")
	public String index(){
		return "loginForm";   //修改index为login
	}
	
	@RequestMapping("/loginForm")
	public String loginForm(){
		return "loginForm";
	}
	
	@RequestMapping("/regSuccess")
	public String register(){
		return "regSuccess";
	}
	
	@RequestMapping("/loginseccess")
	public String loginSuccessPullBack(){
		return "loginseccess";
	}
	
	@RequestMapping("/modifyUser")
	public String modifyUserInfo(){
		return "modifyUser";
	}
	
	
	@RequestMapping(value="/login")
	public String login(@RequestParam(value="userName")String userName,@RequestParam(value="userPwd")String userPwd,
			@RequestParam("userRight")String userRight,HttpSession session,Map<String, Object> map){
		
		User user = userService.login(userName, userPwd);
	
		if(user != null){
			session.setAttribute("user", user);
			return "index";
			/*System.out.println("userRight"+userRight);
			if(userRight=="1001"){
			return "index";
			}
			else if(userRight=="1002"){
			return "index2";	
			}
			else 
				return "ERROR";*/
		}else{
			System.out.println("进入登录错误分支");
			map.put("message", "登录名或密码错误!");
			return "loginForm";
		}
		
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String save(User user){
		System.out.println("Add user: "+user);
		userService.save(user);		
		return "forward:/regSuccess";   //这里原来使用的是重定向我觉着不符合逻辑，重定向一般用在返回首页，这里只是转发一下而已
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String input(Map<String, Object> map){
		map.put("user", new User());
		return "register";
	}
	
	
	@RequestMapping("/userlist")						//在查询过程中SpringMVC的部分并不多，只是获取类集中的所有内容并写到Map中传到request域
	public String list(Map<String, Object> map){
		map.put("users", userService.listUsers());
		return "list";
	}
	
	@RequestMapping(value="/user/{userId}",method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable("userId") Integer userId){
		userService.deleteUser(userId);
		return "redirect:/userlist";		
	}
	
	@RequestMapping(value="/user/{userId}",method=RequestMethod.GET)
	public String modifyUser(@PathVariable("userId") Integer userId, Map<String, Object> map){
		map.put("user", userService.pickUser(userId));
		return "modifyUser";		
	}
	
	@RequestMapping(value="/modify",method=RequestMethod.PUT)
	public String updateUser(User user){
		userService.updateUser(user);
		return "redirect:/userlist";
	}
	
	
	
	
	

}
