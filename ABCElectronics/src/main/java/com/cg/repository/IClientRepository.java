package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.cg.enities.Client;
import com.cg.enities.Engineer;
@Repository

public interface IClientRepository extends JpaRepository<Client,String>
{
	void saveClient(Client clint);
	Client getClientByCLientId(String clientId);
	Engineer getEngineerById(int engineerId);
	List<Engineer> getEngineerByDomain(String domain);
	String changeStatusOfCompaint(int status);
	Client signIn(Client sigIn);
	Client signOut(Client signOut);
	
	 
}
