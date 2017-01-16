package com.janani.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Candidate {

	private String name;

	@Column(name = "email_id")
	private String emailId;

	private String password;

	private String address;

	private Boolean active;
}
