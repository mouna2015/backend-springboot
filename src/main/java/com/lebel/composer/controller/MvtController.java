package com.lebel.composer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lebel.composer.model.Mvt;
import com.lebel.composer.service.IMvtService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class MvtController {
	
    @Autowired
    private IMvtService mvtService;

	
	//get mvt
    @GetMapping(path = "getAllMvt", produces=MediaType.APPLICATION_JSON_VALUE)

	public List<Mvt> getAllMvt() {
        return (List<Mvt>) mvtService.findAllMvt();

	}
	
	//get mvt by id
	
	

}
