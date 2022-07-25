package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "DetailDepartment", catalog = "TestingSystemL5")
@Entity
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "DepartmentID")
public class DetailDepartment extends Department implements Serializable {
//	DepartmentID 			TINYINT UNSIGNED PRIMARY KEY,
//    AddressID 				TINYINT UNSIGNED, -- UNIQUE KEY,  -- NOT NULL ,
//    EmulationPoint 			TINYINT UNSIGNED,
//    FOREIGN KEY(DepartmentID) REFERENCES Department(DepartmentID),
//	FOREIGN KEY(AddressID) REFERENCES Address(AddressID)

	@OneToOne
	@JoinColumn(name = "AddressID")
	private Address address;

	@Column(name = "EmulationPoint")
	private short emulationPoint;
}
