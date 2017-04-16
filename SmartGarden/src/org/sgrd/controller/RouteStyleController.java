package org.sgrd.controller;

import java.util.Map;

import org.sgrd.service.RouteStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/Rot")
public class RouteStyleController {

	@Autowired
	@Qualifier("routeStyleService")
	private RouteStyleService routeStyleService;
	
	/*
	@RequestMapping(value="/{styId}",method=RequestMethod.GET)
	public String list(Map<String, Object> map, @PathVariable Integer styId){
		map.put("routestyles", routeStyleService.getRotsBystyId(styId));
		return "prtRot";
	}
	*/
	
	@RequestMapping("/rotlist/{styId}")						//�ڲ�ѯ������SpringMVC�Ĳ��ֲ����ֻ࣬�ǻ�ȡ�༯�е��������ݲ�д��Map�д���request��
	public String listRots(Map<String, Object> map,@PathVariable Integer styId){
		map.put("routestyles", routeStyleService.getRoutesBySty(styId));
		return "prtRot";
	}
	
	@RequestMapping("/rotlist")						//�ڲ�ѯ������SpringMVC�Ĳ��ֲ����ֻ࣬�ǻ�ȡ�༯�е��������ݲ�д��Map�д���request��
	public String listAllRots(Map<String, Object> map){
		map.put("routestyles", routeStyleService.getAllRoutes());
		return "prtRotAll";
	}
	
	

}
