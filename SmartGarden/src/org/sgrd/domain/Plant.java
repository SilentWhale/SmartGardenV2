package org.sgrd.domain;

import java.io.Serializable;

public class Plant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -490265288782827149L;
	
	public Plant() {
		// TODO Auto-generated constructor stub
	}

	private Integer pltId;
	private String pltNam;
	private String pltIntro;
	private String pltLoc;
	private String pltPic;
	private Integer pltToViwp;
	public Integer getPltId() {
		return pltId;
	}
	public void setPltId(Integer pltId) {
		this.pltId = pltId;
	}
	public String getPltNam() {
		return pltNam;
	}
	public void setPltNam(String pltNam) {
		this.pltNam = pltNam;
	}
	public String getPltIntro() {
		return pltIntro;
	}
	public void setPltIntro(String pltIntro) {
		this.pltIntro = pltIntro;
	}
	public String getPltLoc() {
		return pltLoc;
	}
	public void setPltLoc(String pltLoc) {
		this.pltLoc = pltLoc;
	}
	public String getPltPic() {
		return pltPic;
	}
	public void setPltPic(String pltPic) {
		this.pltPic = pltPic;
	}
	public Integer getPltToViwp() {
		return pltToViwp;
	}
	public void setPltToViwp(Integer pltToViwp) {
		this.pltToViwp = pltToViwp;
	}
	@Override
	public String toString() {
		return "Plant [pltId=" + pltId + ", pltNam=" + pltNam + ", pltIntro="
				+ pltIntro + ", pltLoc=" + pltLoc + ", pltPic=" + pltPic
				+ ", pltToViwp=" + pltToViwp + "]";
	}
	
	

}
