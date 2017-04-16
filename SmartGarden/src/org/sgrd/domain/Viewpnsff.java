package org.sgrd.domain;

import java.io.Serializable;

public class Viewpnsff implements Serializable {

	public Viewpnsff() {
		// TODO Auto-generated constructor stub
	}

	private Integer vnsffId;
	private String vnsffTypNam;
	private Integer sffId;
	private String sffName;
	private String sffIntro;
	private String sffLoc;
	private String sffPic;
	public Viewpnsff(Integer vnsffId, String vnsffTypNam, Integer sffId,
			String sffName, String sffIntro, String sffLoc, String sffPic) {
		super();
		this.vnsffId = vnsffId;
		this.vnsffTypNam = vnsffTypNam;
		this.sffId = sffId;
		this.sffName = sffName;
		this.sffIntro = sffIntro;
		this.sffLoc = sffLoc;
		this.sffPic = sffPic;
	}
	public Integer getVnsffId() {
		return vnsffId;
	}
	public void setVnsffId(Integer vnsffId) {
		this.vnsffId = vnsffId;
	}
	public String getVnsffTypNam() {
		return vnsffTypNam;
	}
	public void setVnsffTypNam(String vnsffTypNam) {
		this.vnsffTypNam = vnsffTypNam;
	}
	public Integer getSffId() {
		return sffId;
	}
	public void setSffId(Integer sffId) {
		this.sffId = sffId;
	}
	public String getSffName() {
		return sffName;
	}
	public void setSffName(String sffName) {
		this.sffName = sffName;
	}
	public String getSffIntro() {
		return sffIntro;
	}
	public void setSffIntro(String sffIntro) {
		this.sffIntro = sffIntro;
	}
	public String getSffLoc() {
		return sffLoc;
	}
	public void setSffLoc(String sffLoc) {
		this.sffLoc = sffLoc;
	}
	public String getSffPic() {
		return sffPic;
	}
	public void setSffPic(String sffPic) {
		this.sffPic = sffPic;
	}
	@Override
	public String toString() {
		return "Viewpnsff [vnsffId=" + vnsffId + ", vnsffTypNam=" + vnsffTypNam
				+ ", sffId=" + sffId + ", sffName=" + sffName + ", sffIntro="
				+ sffIntro + ", sffLoc=" + sffLoc + ", sffPic=" + sffPic + "]";
	}
	
	

}
