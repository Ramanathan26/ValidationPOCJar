package com.example.demo.repos;

import com.example.demo.model.Issue_Intake;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueIntakeRepo extends JpaRepository<Issue_Intake, String> {
	@Cacheable("issueintake")
	Issue_Intake findAllById(String Id);
}
