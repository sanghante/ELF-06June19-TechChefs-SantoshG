package com.techchefs.elf.warehouse.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "items")
public class ItemBean {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String desc;
	
	@Column(name="cost")
	private double cost;
	
	@Column(name="quantity")
	private int quantity;

}
