package com.example.projectservice.model;

import java.time.LocalDateTime;

public class ProjectViewModel {
	private long bid;
	private String item;
	private int qty;
	private int unitPrice;
	private int totalPrice;
	private LocalDateTime billDate;
	private String projectName;
	private String projectType;
	private String clientName;
	
	public ProjectViewModel() {}
	
	public ProjectViewModel(long bid, String item, int qty, int unitPrice, int totalPrice, LocalDateTime billDate,
			String projectName, String projectType, String clientName) {
		this.bid = bid;
		this.item = item;
		this.qty = qty;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.billDate = billDate;
		this.projectName = projectName;
		this.projectType = projectType;
		this.clientName = clientName;
	}

	public long getBid() {
		return bid;
	}

	public void setBid(long bid) {
		this.bid = bid;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public LocalDateTime getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
}
