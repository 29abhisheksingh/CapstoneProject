package com.cg.service;

import java.util.List;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;

public interface IAdminService
{
	void addEngineer(Engineer engineer);
	
	void changeDomain(int id,String domain);
	
	void  removeEngineer(int engineerId);
	
	List<Complaint> getComplaintsByProduct(String product);
	
	List<Complaint> getComplaints(String c1);
	
	Complaint replaceEngineerFromComaplaint(String name,int id);
}

