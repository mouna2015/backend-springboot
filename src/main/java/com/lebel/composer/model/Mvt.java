package com.lebel.composer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="mvt")
public class Mvt {
	
	private int id_mvt;
	private String file_mvt;
	
	public Mvt() {
	
	}
	public Mvt(String file_mvt) {
		super();
		this.file_mvt = file_mvt;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_mvt() {
		return id_mvt;
	}
	public void setId_mvt(int id_mvt) {
		this.id_mvt = id_mvt;
	}
	@Column(name = "file_mvt")

	public String getFile_mvt() {
		return file_mvt;
	}
	public void setFile_mvt(String file_mvt) {
		this.file_mvt = file_mvt;
	}

}
