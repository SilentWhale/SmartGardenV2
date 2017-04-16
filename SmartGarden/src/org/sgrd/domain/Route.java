package org.sgrd.domain;

import java.io.Serializable;

public class Route implements Serializable {

	public Route() {
		// TODO Auto-generated constructor stub
	}

	private Integer rotId;
	private Integer rotStyId;
	private String rotInclViwp;
	private RouteStyle routeStyle;
	
	public RouteStyle getRouteStyle() {
		return routeStyle;
	}
	public void setRouteStyle(RouteStyle routeStyle) {
		this.routeStyle = routeStyle;
	}
	public Integer getRotId() {
		return rotId;
	}
	public void setRotId(Integer rotId) {
		this.rotId = rotId;
	}
	public Integer getRotStyId() {
		return rotStyId;
	}
	public void setRotStyId(Integer rotStyId) {
		this.rotStyId = rotStyId;
	}
	public String getRotInclViwp() {
		return rotInclViwp;
	}
	public void setRotInclViwp(String rotInclViwp) {
		this.rotInclViwp = rotInclViwp;
	}
	
	
	@Override
	public String toString() {
		return "Route [rotId=" + rotId + ", rotStyId=" + rotStyId
				+ ", rotInclViwp=" + rotInclViwp + ", routeStyle=" + routeStyle
				+ "]";
	}
	
	
	
	

}
