package com.cg.serviceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.enities.Complaint;
import com.cg.enities.Engineer;
import com.cg.repository.IEngineerRepository;
import com.cg.service.IEngineerService;
@Service
public class EngineerServiceImpl implements IEngineerService
{
	
	@Autowired
	IEngineerRepository engineRepo;
	
	@Override
	public List<Complaint> getAllOpenComplaints(Engineer engineer) 
	{
		List<Complaint> li=this.engineRepo.getAllOpenComplaints(engineer);
		return li;
	}

	@Override
	public List<Complaint> getResolvedComplaints(Engineer engineer) 
	{
		List<Complaint> li=this.engineRepo.getResolvedComplaints(engineer);
		return li;
	}

	@Override
	public List<Complaint> getResolvedComplaintsByDate(Engineer engineer, LocalDate date) 
	{
		List<Complaint> li=this.engineRepo.getResolvedComplaintsByDate(engineer, date);
		return li;
	}

	@Override
	public List<Complaint> getComplaints(Engineer engineer, String s1) 
	{
		List<Complaint> li=this.engineRepo.getComplaints(engineer, s1);
		return li;
	}

	@Override
	public String changeComplaintStatus(int id) 
	{
		String str=this.engineRepo.changeCompaintStatus(id);
		return str;
	}

}
