package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StandardObjectMappingMaster;

@Repository
public interface StandardObjAttrRepo extends JpaRepository<StandardObjectMappingMaster, Integer> {

}
