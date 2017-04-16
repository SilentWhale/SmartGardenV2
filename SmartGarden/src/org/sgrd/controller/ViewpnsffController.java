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
	
	@RequestMapping("/viwplist/{vnsffTypNamNo}")						//�ڲ�ѯ������SpringMVC�Ĳ��ֲ����ֻ࣬�ǻ�ȡ�༯�е��������ݲ�д��Map�д���request��
	public String listRots(Map<String, Object> map,@PathVariable Integer vnsffTypNamNo){
		
		String vnsffTypNam = " ";
		System.out.println("vnsffTypNam"+vnsffTypNam);
		System.out.println("vnsffTypNamNo"+vnsffTypNamNo);
		if(vnsffTypNamNo==1){
			vnsffTypNam="����";
		}
		else if(vnsffTypNamNo==2){
			vnsffTypNam="������ʩ��";
		}
		else if(vnsffTypNamNo==3){
			vnsffTypNam="������";
		}
		System.out.println("vnsffTypNam"+vnsffTypNam);
		System.out.println("vnsffTypNamNo"+vnsffTypNamNo);
		map.put("viewpoints", viewpnsffService.getviwpsByCat(vnsffTypNam) );
		return "viwplist";  //ԭ����viwplist Ϊ�˼�����ʽ
	}
	
	@RequestMapping("/viwplist")						//�ڲ�ѯ������SpringMVC�Ĳ��ֲ����ֻ࣬�ǻ�ȡ�༯�е��������ݲ�д��Map�д���request��
	public String listAllRots(Map<String, Object> map){
		map.put("viewpoints", viewpnsffService.getAllviwps());
		return "viwplistAll";
	}

}
