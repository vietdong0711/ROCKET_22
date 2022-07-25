package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vti.entity.News;

public interface INewsRepository extends JpaRepository<News, Integer>, JpaSpecificationExecutor<News> {

}
