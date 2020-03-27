package com.lebel.composer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lebel.composer.model.Mvt;


@Repository
public interface MvtRepository extends JpaRepository<Mvt,Integer> {
	Optional<Mvt> findById(int id);

	

}
