package org.sgrd.service;

import java.util.List;

import org.sgrd.domain.Viewpnsff;

public interface ViewpnsffService {
	
	List<Viewpnsff> getviwpsByCat(String vnsffTypNam);
	
	List<Viewpnsff> getAllviwps();
}
