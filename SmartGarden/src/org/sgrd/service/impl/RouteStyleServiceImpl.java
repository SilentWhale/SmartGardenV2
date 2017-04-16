package org.sgrd.service.impl;

import java.util.List;

import org.sgrd.domain.RouteStyle;
import org.sgrd.mapper.RouteStyleMapper;
import org.sgrd.service.RouteStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("routeStyleService")
public class RouteStyleServiceImpl implements RouteStyleService {

	@Autowired
	private RouteStyleMapper routeStyleMapper;
	
	/*public RouteStyle getRotsBystyId(Integer styId){
		System.out.println("StyId传入成功： " + styId );
		System.out.println("有返回值" + routeStyleMapper.getRouteStyleWithRoutesByStyId(styId));
		return routeStyleMapper.getRouteStyleWithRoutesByStyId(styId);
	}*/
	
	public List<RouteStyle> getRoutesBySty(Integer styId){
		return routeStyleMapper.selectRoutesByStyId(styId);
	}
	
	public List<RouteStyle> getAllRoutes(){
		return routeStyleMapper.selectAllRoutes();
	}
	
	
}
