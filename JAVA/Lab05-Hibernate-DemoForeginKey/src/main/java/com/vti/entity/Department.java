package com.vti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Department", catalog = "testingsystemL5")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Department implements Serializable {
	@Id
	@Column(name = "departmentid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "departmentname", length = 30, nullable = false, unique = true)
	private String name;

	@OneToMany(mappedBy = "department")
	private List<Account> accounts;

}
