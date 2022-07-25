package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Address", catalog = "TestingSystemL5")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address implements Serializable {

//	AddressID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
//    AddressName 			NVARCHAR(100) NOT NULL UNIQUE KEY

	@Id
	@Column(name = "AddressID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "AddressName", length = 50, nullable = false, unique = true)
	private String name;

	@OneToOne(mappedBy = "address")
	private DetailDepartment detailDepartment;
}
