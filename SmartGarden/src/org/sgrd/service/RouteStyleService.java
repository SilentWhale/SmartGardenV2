package org.sgrd.service;

import java.util.List;

import org.sgrd.domain.RouteStyle;


public interface RouteStyleService {
	
	

	
	//RouteStyle getRotsBystyId(Integer styId);
	
	List<RouteStyle> getRoutesBySty(Integer styId);
	
	List<RouteStyle> getAllRoutes();
	
	
}
