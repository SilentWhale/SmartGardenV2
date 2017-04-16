package org.sgrd.domain;

import java.io.Serializable;
import java.util.List;

public class RouteStyle implements Serializable {

	public RouteStyle() {
		// TODO Auto-generated constructor stub
	}

	private Integer styId;
	private String styNam;
	private String rotInclViwp;
	private Integer rotId;
	public RouteStyle(Integer styId, String styNam, String rotInclViwp,
			Integer rotId) {
		super();
		this.styId = styId;
		this.styNam = styNam;
		this.rotInclViwp = rotInclViwp;
		this.rotId = rotId;
	}
	public Integer getStyId() {
		return styId;
	}
	public void setStyId(Integer styId) {
		this.styId = styId;
	}
	public String getStyNam() {
		return styNam;
	}
	public void setStyNam(String styNam) {
		this.styNam = styNam;
	}
	public String getRotInclViwp() {
		return rotInclViwp;
	}
	public void setRotInclViwp(String rotInclViwp) {
		this.rotInclViwp = rotInclViwp;
	}
	public Integer getRotId() {
		return rotId;
	}
	public void setRotId(Integer rotId) {
		this.rotId = rotId;
	}
	@Override
	public String toString() {
		return "RouteStyle [styId=" + styId + ", styNam=" + styNam
				+ ", rotInclViwp=" + rotInclViwp + ", rotId=" + rotId + "]";
	}
	
	
	
}
