package org.sgrd.controller;

import java.util.Map;

import org.sgrd.service.ViewpnsffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/viwp")
public class ViewpnsffController {

	@Autowired
	@Qualifier("viewpnsffService")
	private ViewpnsffService viewpnsffService;
	
	@RequestMapping("/viwplist/{vnsffTypNamNo}")						//在查询过程中SpringMVC的部分并不多，只是获取类集中的所有内容并写到Map中传到request域
	public String listRots(Map<String, Object> map,@PathVariable Integer vnsffTypNamNo){
		
		String vnsffTypNam = " ";
		System.out.println("vnsffTypNam"+vnsffTypNam);
		System.out.println("vnsffTypNamNo"+vnsffTypNamNo);
		if(vnsffTypNamNo==1){
			vnsffTypNam="花类";
		}
		else if(vnsffTypNamNo==2){
			vnsffTypNam="公共设施类";
		}
		else if(vnsffTypNamNo==3){
			vnsffTypNam="景点类";
		}
		System.out.println("vnsffTypNam"+vnsffTypNam);
		System.out.println("vnsffTypNamNo"+vnsffTypNamNo);
		map.put("viewpoints", viewpnsffService.getviwpsByCat(vnsffTypNam) );
		return "viwplist";  //原来是viwplist 为了加载样式
	}
	
	@RequestMapping("/viwplist")						//在查询过程中SpringMVC的部分并不多，只是获取类集中的所有内容并写到Map中传到request域
	public String listAllRots(Map<String, Object> map){
		map.put("viewpoints", viewpnsffService.getAllviwps());
		return "viwplistAll";
	}

}
