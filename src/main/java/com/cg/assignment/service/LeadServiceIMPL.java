package com.cg.assignment.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.assignment.dto.LeadResponseDTO;
import com.cg.assignment.entity.Lead;

import com.cg.assignment.repository.ILeadRepository;

@Service

public  class LeadServiceIMPL implements ILeadService{
	
	@Autowired
	ILeadRepository leadRepository;

	@Override
	public Lead addLead(Lead lead){

		return leadRepository.save(lead);
	}
	
	
	
//	@Override
//	public Leads addLeadStage2(LeadsDTO2 leadsDTO2){
//
//			return leadsRepository.save(leadsDTO2);
//	}
//	
	
	

	@Override
	public List<Lead> getAllLeads() {
		// TODO Auto-generated method stub
		return leadRepository.findAll();
	}
}
