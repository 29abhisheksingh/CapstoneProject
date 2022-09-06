package com.cg.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.cg.enities.Client;
import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.enities.Product;

public interface IComplaintService 
{
	
	boolean bookComplaint(Client client,Complaint complaint,Product product);

	String changeComplaintStatus(Complaint complaint);

	List<Complaint> getClientAllComplaints(Client client);
	

	List<Complaint> getClientAllOpenComplaints(Client client);

	Engineer getEngineer(int id);
	

	Product getProductByComplaint(int id);
}
