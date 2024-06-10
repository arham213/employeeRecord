package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	Integer eid;
	String ename;
	String erole;
	String edept;
	
	public Employee() {
		
	}

	public Employee(Integer eid, String ename, String erole, String edept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.erole = erole;
		this.edept = edept;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getErole() {
		return erole;
	}

	public void setErole(String erole) {
		this.erole = erole;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}
	
	
}