package org.sgrd.service.impl;

import java.util.List;

import org.sgrd.domain.Viewpnsff;
import org.sgrd.mapper.ViewpnsffMapper;
import org.sgrd.service.ViewpnsffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("viewpnsffService")
public class ViewpnsffServiceImpl implements ViewpnsffService {
	
	@Autowired
	private ViewpnsffMapper viewpnsffMapper;
	
    public List<Viewpnsff> getviwpsByCat(String vnsffTypNam){
    	return viewpnsffMapper.selectItemsByViwpCatNam(vnsffTypNam); 
    }
	
	public List<Viewpnsff> getAllviwps(){
		return viewpnsffMapper.selectAllViwps();
	}

}
