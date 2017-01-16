package com.janani.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Medicine {

	private String name;

	@Column(name = "mfg_date")
	private LocalDate manufacturedDate;

	@Column(name = "exp_date")
	private LocalDate expiryDate;

	@Column(name = "batch_no")
	private Integer batchNo;

	private Float cost;

	private String category;

	private Boolean active;
}
