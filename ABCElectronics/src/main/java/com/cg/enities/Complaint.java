package com.cg.enities;

import javax.persistence.*;


@Entity
public class Complaint
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int complaintId;
	
	@Column
	private String prodctModelNumber;
	
	
	@Column
	private String complainName;
	
	
	@Column
	private String statusw;
	
	
	@Column
	private String clientId;
	
	
	@Column
	private int engineerId;
	
	
	@Column
	private int statusByEng;

	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Complaint(int complaintId, String prodctModelNumber, String complainName, String statusw, String clientId,
			int engineerId, int statusByEng) {
		super();
		this.complaintId = complaintId;
		this.prodctModelNumber = prodctModelNumber;
		this.complainName = complainName;
		this.statusw = statusw;
		this.clientId = clientId;
		this.engineerId = engineerId;
		this.statusByEng = statusByEng;
	}



	public int getComplaintId() {
		return complaintId;
	}

	public int getStatusByEng() {
		return statusByEng;
	}



	public void setStatusByEng(int statusByEng) {
		this.statusByEng = statusByEng;
	}



	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getProdctModelNumber() {
		return prodctModelNumber;
	}

	public void setProdctModelNumber(String prodctModelNumber) {
		this.prodctModelNumber = prodctModelNumber;
	}

	public String getComplainName() {
		return complainName;
	}

	public void setComplainName(String complainName) {
		this.complainName = complainName;
	}

	public String getStatusw() {
		return statusw;
	}

	public void setStatusw(String statusw) {
		this.statusw = statusw;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public int getEngineerId() {
		return engineerId;
	}

	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}
	
	
}
