package org.sgrd.service.impl;


import java.util.List;


import org.sgrd.domain.User;
import org.sgrd.mapper.UserMapper;
import org.sgrd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service("userService")
	public class UserServiceImpl implements UserService{
		
		@Autowired
		private UserMapper userMapper;
	
		public User login(String userName,String userPwd){
			System.out.println("进入Service中的login方法\n userName:"
				+userName+"\n userPwd:"+userPwd);
			return userMapper.findWithLoginnameAndPassword(userName, userPwd);		
		}
		
		public void save(User user){
			userMapper.saveUserInGeneral(user);			
		}
		
		public List<User> listUsers(){
			return userMapper.selectAllUser();
		}
		
		public void deleteUser(Integer userId){
			userMapper.deleteSingleUserById(userId);		
		}
		
		public User pickUser(Integer userId){
			return userMapper.findSingleUserById(userId);
		}
		
		public void updateUser(User user){
			userMapper.updateUserInfo(user);
		}
	}

