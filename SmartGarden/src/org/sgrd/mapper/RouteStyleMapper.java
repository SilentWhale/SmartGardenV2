package org.sgrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.sgrd.domain.RouteStyle;
import org.sgrd.domain.User;

public interface RouteStyleMapper {
		
	/*此写法参照大红书里的基于注解的一对多查询，报出500错误，查找后基本是说需要结合接口和XML文件，一一对应，但是没用
	@Select("select * from sg_routestyle where styId = #{styId}")
	@Results({
		@Result(column="styNam",property="styNam"),
		@Result(column="styId",property="routes",
		many=@Many(
				select="org.sgrd.mapper.RouteMapper.getRouteInfoByrotStyId",fetchType=FetchType.LAZY
				)
		)		
	})
	RouteStyle getRouteStyleWithRoutesByStyId(Integer styId);
	*/
	
	@Select("select * from sg_routestyle where styId= #{styId}")
	List<RouteStyle> selectRoutesByStyId(Integer styId);
	
	@Select("select * from sg_routestyle")
	List<RouteStyle> selectAllRoutes();
	
	
}
