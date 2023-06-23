package com.cg.assignment.controller;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.assignment.dto.LeadResponseDTO;
import com.cg.assignment.entity.Lead;
import com.cg.assignment.service.ILeadService;
import com.cg.assignment.service.LeadServiceIMPL;
import com.cg.assignment.util.LeadDTOConvertor;


@RestController
@RequestMapping("/lead")

@CrossOrigin(origins = {"http://localhost:4200/","http://localhost:9090/"},allowedHeaders = "*")


public class LeadController {
	
private final Logger logger = LoggerFactory.getLogger(this.getClass());

@Autowired
private ILeadService leadService;

@Autowired
private LeadDTOConvertor leadDTOConvertor;


public LeadController() {

	System.err.println("-------------------------LeadsController Controller Called--------------------------");
}

@PostMapping("/add")
public ResponseEntity<LeadResponseDTO> addLead(@RequestBody Lead lead) {
	 Lead savedLead = leadService.addLead(lead);

		logger.info("---->> Lead saved"+savedLead);
		
		
		if(savedLead != null) {

			LeadResponseDTO dtoObj = leadDTOConvertor.getLeadResponseDTO(savedLead);
		return new ResponseEntity<LeadResponseDTO>(dtoObj,HttpStatus.OK);
	}
		return null;
			
	}

//@PostMapping("/add2")
//public ResponseEntity<LeadsResponseDTO> addLeadStep2(@RequestBody LeadsDTO2 leadsDTO) {
//	 Leads savedLead = leadsService.addLeadStage2(leadsDTO);
//
//		logger.info("---->> Lead saved"+savedLead);
//		
//		
//		if(savedLead != null) {
//
//			LeadsResponseDTO dtoObj = leadsDTOConvertor.getLeadsResponseDTO(savedLead);
//		return new ResponseEntity<LeadsResponseDTO>(dtoObj,HttpStatus.OK);
//	}
//		return null;
//			
//	}
//


@GetMapping("/all")
public ResponseEntity<List<LeadResponseDTO>> getAllLeads()
{
	List<Lead> allLeads = leadService.getAllLeads();
	
	List<LeadResponseDTO> allLeadDTO = new ArrayList<>();
	
	for (Lead lead : allLeads) {
		
		allLeadDTO.add(leadDTOConvertor.getLeadResponseDTO(lead));		
	}
	return new ResponseEntity<List<LeadResponseDTO>>(allLeadDTO,HttpStatus.OK);
}

}
