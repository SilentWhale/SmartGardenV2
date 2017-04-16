package org.sgrd.domain;

import java.io.Serializable;

public class Facility implements Serializable {

	public Facility() {
		// TODO Auto-generated constructor stub
	}

	private Integer facId;
	private String facNam;
	private String facIntro;
	private String facLoc;
	private String facPic;
	private Integer facToViwp;
	public Integer getFacId() {
		return facId;
	}
	public void setFacId(Integer facId) {
		this.facId = facId;
	}
	public String getFacNam() {
		return facNam;
	}
	public void setFacNam(String facNam) {
		this.facNam = facNam;
	}
	public String getFacIntro() {
		return facIntro;
	}
	public void setFacIntro(String facIntro) {
		this.facIntro = facIntro;
	}
	public String getFacLoc() {
		return facLoc;
	}
	public void setFacLoc(String facLoc) {
		this.facLoc = facLoc;
	}
	public String getFacPic() {
		return facPic;
	}
	public void setFacPic(String facPic) {
		this.facPic = facPic;
	}
	public Integer getFacToViwp() {
		return facToViwp;
	}
	public void setFacToViwp(Integer facToViwp) {
		this.facToViwp = facToViwp;
	}
	
	@Override
	public String toString() {
		return "Facility [facId=" + facId + ", facNam=" + facNam
				+ ", facIntro=" + facIntro + ", facLoc=" + facLoc + ", facPic="
				+ facPic + ", facToViwp=" + facToViwp + "]";
	}
	
	
	

}
