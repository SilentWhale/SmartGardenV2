package org.sgrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.sgrd.domain.Viewpnsff;

public interface ViewpnsffMapper {

	
	@Select("select * from sg_viewpnsff where vnsffTypNam= #{vnsffTypNam}")
	List<Viewpnsff> selectItemsByViwpCatNam(String vnsffTypNam);
	

	@Select("select * from sg_viewpnsff")
	List<Viewpnsff> selectAllViwps();
}
