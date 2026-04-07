package com.skillio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillio.model.Batch;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Integer>{

}
