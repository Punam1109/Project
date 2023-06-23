package com.cg.assignment.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Table(name = "Lead")

@Entity
@Data
@NoArgsConstructor

public class Lead {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private LocalDate dob;
	private int pincode;
	private String gender;
	private String smoker;
	private String alcoholic;
	private String address;
	private String dependant;
	private LocalDate annualIncome;
	private int govRebate;
	private int taxRebate;
	private String idProof;
	private String financialProof;
	private String quotationRef;
	private String premium;
	private String product;
	private long sum;
	private String leadStage;
	private String contacted;
	
	
	public Lead(int id, String firstName, String lastName, String phoneNumber, String email, LocalDate dob, int pincode,
			String gender, String smoker, String alcoholic, String address, String dependant, LocalDate annualIncome,
			int govRebate, int taxRebate, String idProof, String financialProof, String quotationRef, String premium,
			String product, long sum, String leadStage, String contacted) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.dob = dob;
		this.pincode = pincode;
		this.gender = gender;
		this.smoker = smoker;
		this.alcoholic = alcoholic;
		this.address = address;
		this.dependant = dependant;
		this.annualIncome = annualIncome;
		this.govRebate = govRebate;
		this.taxRebate = taxRebate;
		this.idProof = idProof;
		this.financialProof = financialProof;
		this.quotationRef = quotationRef;
		this.premium = premium;
		this.product = product;
		this.sum = sum;
		this.leadStage = leadStage;
		this.contacted = contacted;
	}
	
	
}
	  

