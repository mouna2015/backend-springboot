package com.lebel.composer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lebel.composer.model.Mvt;
import com.lebel.composer.repository.MvtRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/")
public class MvtController {
	
	@Autowired
	private MvtRepository mvtRepository;
	
	//get mvt
	
	@GetMapping("mvt")
	public List <Mvt> getAllMvt(){
		return this.mvtRepository.findAll();
	}
	
	//get mvt by id
	
	@GetMapping("/mvt/{id_mvt}")
	public Optional<Mvt> findMvtById(@PathVariable int id_mvt) {
	    return mvtRepository.findById(id_mvt);
	}

}
