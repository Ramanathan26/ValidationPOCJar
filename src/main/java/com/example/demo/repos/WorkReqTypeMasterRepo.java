package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Work_Request_Type_Master;

@Repository
public interface WorkReqTypeMasterRepo extends JpaRepository<Work_Request_Type_Master, Integer> {

	Work_Request_Type_Master findByWorkRequestType(String value);

}
