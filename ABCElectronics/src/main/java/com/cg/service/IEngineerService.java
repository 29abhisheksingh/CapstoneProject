package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;

public interface IEngineerService 
{
	List<Complaint> getAllOpenComplaints(Engineer engineer);
	
	List<Complaint> getResolvedComplaints(Engineer engineer);
	
	List<Complaint> getResolvedComplaintsByDate(Engineer engineer, LocalDate date);
	
	List<Complaint> getComplaints(Engineer engineer,String s1);
	
	String changeComplaintStatus(int id);
}
