package com.cg.assignment.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class LeadResponseDTO {
	
	
	private String msg;
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private LocalDate dob;
	private int pincode;
	private String gender;
	private String smoking;
	private String drinking;
	private String address;
	private String dependant;
	private LocalDate annualIncome;
	private int govRebate;
	private int tax;
	private String idProof;
	private String financialProof;
	private String quotationRef;
	private String premium;
	private String product;
	private long sum;
	private String leadStage;
	private String contacted;

}
