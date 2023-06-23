package com.cg.assignment.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.cg.assignment.entity.Lead;

@Service

public interface ILeadService {

	
	public Lead addLead(Lead lead);

	public List<Lead> getAllLeads();

//	Leads addLeadStage1(LeadsDTO leadsDTO);
	 	

}
