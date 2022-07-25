package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vti.entity.Supply;

public interface ISupplyRepository extends JpaRepository<Supply, Integer>, JpaSpecificationExecutor<Supply> {

}
