package com.cg.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.assignment.entity.Lead;

@Repository


public interface ILeadRepository extends JpaRepository<Lead,Integer>{
	

//List<Review> getReviewByStarRating(int starRating);	
	


}
