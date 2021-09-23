package com.laurel.jpa.hibernate5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="fruit_table")
public class Fruit {
	
	@Id
	private int fID;
	@Column(name="fruit_name")
	private String fName;
	
	private String fColor;
	//private Vendor vendor;
	
	public int getfID() {
		return fID;
	}
	public void setfID(int fID) {
		this.fID = fID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfColor() {
		return fColor;
	}
	public void setfColor(String fColor) {
		this.fColor = fColor;
	}
	@Override
	public String toString() {
		return "Fruit [fID=" + fID + ", fName=" + fName + ", fColor=" + fColor + "]";
	}


	
}
