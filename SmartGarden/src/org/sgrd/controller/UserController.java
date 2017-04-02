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

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	
	@RequestMapping("/")
	public String index(){
		return "index";
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
			HttpSession session,Map<String, Object> map){
		System.out.println("����controller�е�login����\n userName:"
				+userName+"\n userPwd:"+userPwd);
		User user = userService.login(userName, userPwd);
	
		if(user != null){
			session.setAttribute("user", user);
			return "loginseccess";			
		}else{
			System.out.println("�����¼�����֧");
			map.put("message", "��¼�����������!");
			return "loginForm";
		}
		
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String save(User user){
		System.out.println("Add user: "+user);
		userService.save(user);		
		return "forward:/regSuccess";   //����ԭ��ʹ�õ����ض����Ҿ��Ų������߼����ض���һ�����ڷ�����ҳ������ֻ��ת��һ�¶���
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String input(Map<String, Object> map){
		map.put("user", new User());
		return "register";
	}
	
	
	@RequestMapping("/userlist")						//�ڲ�ѯ������SpringMVC�Ĳ��ֲ����ֻ࣬�ǻ�ȡ�༯�е��������ݲ�д��Map�д���request��
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
