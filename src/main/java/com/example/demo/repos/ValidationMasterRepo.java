package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Validation_Master;


@Repository
public interface ValidationMasterRepo extends JpaRepository<Validation_Master, Integer> {
	 List<Validation_Master> findAllByWorkRequestTypeId_wId(Integer workRequestTypeId);
}
