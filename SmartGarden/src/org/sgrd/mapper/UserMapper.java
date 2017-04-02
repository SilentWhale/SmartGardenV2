package org.sgrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.sgrd.domain.User;





public interface UserMapper {

	@Select("select * from sg_user where userName = #{userName} and userPwd = #{userPwd}")
		User findWithLoginnameAndPassword(@Param("userName")String userName,@Param("userPwd")String userPwd);

	@Insert("insert into sg_user(userName,userPwd,userSex,userMail,userPhone,userAge) values(#{userName},#{userPwd},#{userSex},#{userMail},#{userPhone},#{userAge})")
	@Options(useGeneratedKeys=true,keyProperty="userId")
		void saveUserInGeneral(User user);
	
	@Select("select * from sg_user")
	List<User> selectAllUser();
	
	@Delete("delete from sg_user where userId=#{userId}")
		void deleteSingleUserById(@Param("userId") Integer userId);
	
	@Select("select * from sg_user where userId = #{userId}")
	 	User findSingleUserById(@Param("userId") Integer userId);
	
	@Update("update sg_user set userName=#{userName},userPwd=#{userPwd},userSex=#{userSex},userMail=#{userMail},userPhone=#{userPhone},userAge=#{userAge} where userId=#{userId}")
		void updateUserInfo(User user);
	
	
	// Get Set·½·¨
	@Select("select userName from sg_user where userId=#{userId}")
		String getuserName(Integer userId);
	
	@Select("select userPwd from sg_user where userId=#{userId}")
	String getuserPwd(Integer userId);
	
	@Select("select userSex from sg_user where userId=#{userId}")
	String getuserSex(Integer userId);
	
	@Select("select userMail from sg_user where userId=#{userId}")
	String getuserMail(Integer userId);
	
	@Select("select userPhone from sg_user where userId=#{userId}")
	String getuserPhone(Integer userId);
	
	@Select("select userAge from sg_user where userId=#{userId}")
	int getuserAge(Integer userId);
	
	@Select("select userHis from sg_user where userId=#{userId}")
	String getuserHis(Integer userId);
	
	
	
		
}
