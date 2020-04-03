package com.lebel.composer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lebel.composer.model.Mvt;
import com.lebel.composer.repository.MvtRepository;

@Service
public class MvtService implements IMvtService {
	
	@Autowired
	private MvtRepository mvtRepository;
	

	@Override
	public List<Mvt> findAllMvt() {
        return (List<Mvt>) mvtRepository.findAll();

	}

}
