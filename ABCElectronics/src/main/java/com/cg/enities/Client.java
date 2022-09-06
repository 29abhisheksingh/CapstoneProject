package com.cg.enities;

import java.util.List;

import javax.persistence.*;

@Entity
public class Client
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String clientId;
	
	@Column
	private String password;
	
	@Column
	private String address;
	
	@Column
	private long phoneNumber;
	
	@OneToMany(targetEntity=Complaint.class,cascade=CascadeType.ALL)
	@JoinColumn(name="client_complaint",referencedColumnName="clientId")
	private List<Complaint> complaint;
	
	@OneToMany(targetEntity=Product.class,cascade=CascadeType.ALL)
	@JoinColumn(name="client_product",referencedColumnName="clientId")
	private List<Product> product;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String clientId, String password, String address, long phoneNumber, List<Complaint> complaint,
			List<Product> product) {
		super();
		this.clientId = clientId;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.complaint = complaint;
		this.product = product;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Complaint> getComplaint() {
		return complaint;
	}

	public void setComplaint(List<Complaint> complaint) {
		this.complaint = complaint;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
}
