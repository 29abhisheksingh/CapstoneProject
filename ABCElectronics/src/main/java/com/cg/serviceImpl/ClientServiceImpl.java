package com.cg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.enities.Client;
import com.cg.enities.Engineer;
import com.cg.repository.IClientRepository;
import com.cg.service.IClientService;
@Service
public class ClientServiceImpl implements IClientService 
{

	@Autowired
	IClientRepository clientRepo;
	
	@Override
	public void saveClient(Client client)
	{
		this.clientRepo.saveClient(client);
		
	}

	@Override
	public Client getClientByCLientId(String clientId) 
	{
		Client clin=this.clientRepo.getClientByCLientId(clientId);
		return clin;
	}

	@Override
	public Engineer getEngineerById(int employeeId) 
	{
		Engineer engin=this.clientRepo.getEngineerById(employeeId);
		return engin;
	}

	@Override
	public List<Engineer> getEngineersByDomain(String domain) 
	{
		List<Engineer> li=this.clientRepo.getEngineerByDomain(domain);
		return li;
	}

	@Override
	public String changeStatusOfComplaint(int status) 
	{
		String str=this.clientRepo.changeStatusOfCompaint(status);
		return str;
	}

	@Override
	public Client signIn(Client signClient) 
	{
		Client clin=this.clientRepo.signIn(signClient);
		return clin;
	}

	@Override
	public Client signOut(Client signClient) 
	{
		Client clin=this.clientRepo.signOut(signClient);
		return clin;
	}

}
