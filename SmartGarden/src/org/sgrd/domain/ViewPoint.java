package org.sgrd.domain;

import java.io.Serializable;
import java.util.List;

public class ViewPoint implements Serializable {

	public ViewPoint() {
		// TODO Auto-generated constructor stub
	}

	private Integer viwpId;
	private String viwTypNam;

	
	
	
	public Integer getViwpId() {
		return viwpId;
	}
	public void setViwpId(Integer viwpId) {
		this.viwpId = viwpId;
	}
	public String getViwTypNam() {
		return viwTypNam;
	}
	public void setViwTypNam(String viwTypNam) {
		this.viwTypNam = viwTypNam;
	}
	@Override
	public String toString() {
		return "ViewPoint [viwpId=" + viwpId + ", viwTypNam=" + viwTypNam + "]";
	}
	
	
	

}
