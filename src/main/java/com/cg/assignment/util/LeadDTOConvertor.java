package com.cg.assignment.util;

import org.springframework.stereotype.Component;
import com.cg.assignment.dto.LeadDTO;
import com.cg.assignment.dto.LeadResponseDTO;

import com.cg.assignment.entity.Lead;

@Component

public class LeadDTOConvertor {
	
public LeadResponseDTO getLeadResponseDTO(Lead lead) {
		
		LeadResponseDTO dto = new LeadResponseDTO();
	
		dto.setId(lead.getId());
		dto.setFirstName(lead.getFirstName());
		dto.setLastName(lead.getLastName());
	    dto.setPhoneNumber(lead.getPhoneNumber());
	    dto.setEmail(lead.getEmail());
		dto.setDob(lead.getDob());
		dto.setPincode(lead.getPincode());
		dto.setGender(lead.getGender());
		dto.setSmoking(lead.getSmoker());
		dto.setDrinking(lead.getAlcoholic());
		dto.setAddress(lead.getAddress());
		dto.setDependant(lead.getDependant());
		dto.setAnnualIncome(lead.getAnnualIncome());
		dto.setGovRebate(lead.getGovRebate());
		dto.setTax(lead.getTaxRebate());
		dto.setIdProof(lead.getIdProof());
		dto.setFinancialProof(lead.getFinancialProof());
		dto.setQuotationRef(lead.getQuotationRef());
		dto.setPremium(lead.getPremium());
		dto.setProduct(lead.getProduct());
		dto.setSum(lead.getSum());
		dto.setLeadStage(lead.getLeadStage());
		dto.setContacted(lead.getContacted());


		dto.setMsg("Lead Saved");
		return dto;
	}
	
public LeadDTO getLeadsDTO(Lead leads) {
	
	LeadDTO obj = new LeadDTO(leads.getId(),leads.getFirstName(), leads.getLastName(), leads.getPhoneNumber(), leads.getEmail(), leads.getDob(), leads.getPincode(),
			leads.getGender(), leads.getSmoker(), leads.getAlcoholic(), leads.getAddress(), leads.getDependant(), leads.getAnnualIncome(),
			leads.getGovRebate(), leads.getTaxRebate(), leads.getIdProof(), leads.getFinancialProof(), leads.getQuotationRef(), leads.getPremium(),
			leads.getProduct(), leads.getSum(), leads.getLeadStage(), leads.getContacted());
	
	return obj;
	
}
	

}
