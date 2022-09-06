package com.cg.service;

import java.util.List;

import com.cg.enities.Client;
import com.cg.enities.Engineer;

public interface IClientService
{
	void saveClient(Client client);
	
	Client getClientByCLientId(String clientId);
	
	Engineer getEngineerById(int employeeId);
	
	List<Engineer> getEngineersByDomain(String domain);
	
	String changeStatusOfComplaint(int status);
	
	Client signIn(Client signClient);
	
	Client signOut(Client signClient);
	
}
