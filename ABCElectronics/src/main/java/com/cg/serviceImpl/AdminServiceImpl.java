package com.cg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.repository.IAdminRepository;
import com.cg.repository.IEngineerRepository;
import com.cg.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService
{
	@Autowired
	IEngineerRepository engineerRepo;
	
	@Autowired
	IAdminRepository adRepo;

	@Override
	public void addEngineer(Engineer engineer) 
	{
		this.adRepo.save(engineer);
		
	}

	@Override
	public void changeDomain(int id, String domain) 
	{
		this.adRepo.changeDomain(id, domain);
		
	}

	@Override
	public void removeEngineer(int engineerId) 
	{
		this.adRepo.deleteById(engineerId);
		
	}

	@Override
	public List<Complaint> getComplaintsByProduct(String product) 
	{
		List<Complaint> li=this.getComplaintsByProduct(product);
		return li;
	}

	@Override
	public List<Complaint> getComplaints(String complain) 
	{
		List<Complaint> li=this.adRepo.getComplaints();
		return li;
	}

	@Override
	public Complaint replaceEngineerFromComaplaint(String name,int id) 
	{
		Complaint com=this.adRepo.replaceEngineerFromComplaint(name,id);
		return com;
	}

}
