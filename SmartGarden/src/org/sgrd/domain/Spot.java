package org.sgrd.domain;

import java.io.Serializable;

public class Spot implements Serializable {

	public Spot() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer sptId;
	private String sptName;
	private String sptIntro;
	private String sptLoc;
	private String sptPic;
	private Integer sptToViwp;
	
	public Integer getSptId() {
		return sptId;
	}
	public void setSptId(Integer sptId) {
		this.sptId = sptId;
	}
	public String getSptName() {
		return sptName;
	}
	public void setSptName(String sptName) {
		this.sptName = sptName;
	}
	public String getSptIntro() {
		return sptIntro;
	}
	public void setSptIntro(String sptIntro) {
		this.sptIntro = sptIntro;
	}
	public String getSptLoc() {
		return sptLoc;
	}
	public void setSptLoc(String sptLoc) {
		this.sptLoc = sptLoc;
	}
	public String getSptPic() {
		return sptPic;
	}
	public void setSptPic(String sptPic) {
		this.sptPic = sptPic;
	}
	public Integer getSptToViwp() {
		return sptToViwp;
	}
	public void setSptToViwp(Integer sptToViwp) {
		this.sptToViwp = sptToViwp;
	}
	@Override
	public String toString() {
		return "Spot [sptId=" + sptId + ", sptName=" + sptName + ", sptIntro="
				+ sptIntro + ", sptLoc=" + sptLoc + ", sptPic=" + sptPic
				+ ", sptToViwp=" + sptToViwp + "]";
	}
	
	

	

}
