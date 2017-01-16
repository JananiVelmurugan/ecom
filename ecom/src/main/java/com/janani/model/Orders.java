package com.janani.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Orders {

	private Candidate candidate;

	private Medicine medicine;

	@Column(name = "qty")
	private Integer quantity;

	@Column(name = "total_cost")
	private Float totalCost;

	@Column(name = "order_date")
	private LocalDate orderDate;

	private String status;
}
