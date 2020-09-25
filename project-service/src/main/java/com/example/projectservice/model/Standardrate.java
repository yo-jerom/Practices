package com.example.projectservice.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "standardrate")
public class Standardrate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String item;
	private int qty;
	private int unitPrice;
	private int totalPrice;
	private LocalDateTime billDate;
	private long pid;
	
	/*@ManyToOne
    @JoinColumn(name = "pid")
    @JsonIgnore
    private Project project;*/
	
	public Standardrate() {}

	public Standardrate(long id, String item, int qty, int unitPrice, int totalPrice, LocalDateTime billDate,
			long pid) {
		this.id = id;
		this.item = item;
		this.qty = qty;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.billDate = billDate;
		this.pid = pid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}
}