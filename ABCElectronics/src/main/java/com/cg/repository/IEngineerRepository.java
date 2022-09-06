package com.cg.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
@Repository

public interface IEngineerRepository extends JpaRepository<Engineer,Integer>
{
	List<Complaint> getAllOpenComplaints(Engineer engine);
	List<Complaint> getResolvedComplaints(Engineer engine);
	List<Complaint> getResolvedComplaintsByDate(Engineer engine,LocalDate localDate);
	List<Complaint> getComplaints(Engineer engine,String complain);
	String changeCompaintStatus(int id);
}
