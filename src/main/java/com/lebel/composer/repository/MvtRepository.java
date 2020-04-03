package com.lebel.composer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lebel.composer.model.Mvt;


@Repository
public interface MvtRepository extends JpaRepository<Mvt,Integer> {


	

}
