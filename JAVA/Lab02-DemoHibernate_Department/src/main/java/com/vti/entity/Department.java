package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department", catalog = "testingsystem")
public class Department implements Serializable {
	@Id
	@Column(name = "departmentid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "departmentname", length = 30, nullable = false, unique = true)
	private String name;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
