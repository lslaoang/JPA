package com.laurel.jpa.hibernate5;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {
	
	@Id
	private int vID;
	private String vName;
	private String location;
	
	public int getvID() {
		return vID;
	}
	public void setvID(int vID) {
		this.vID = vID;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Vendor [vID=" + vID + ", vName=" + vName + ", location=" + location + "]";
	}


	
}
