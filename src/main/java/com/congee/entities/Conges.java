package com.congee.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Conges {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Conges;
	private String adressC;
	private Date dateDebut;
	private Date dateFin;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_employer_conges")
	private Employes employes;
	
	public Long getId_Conges() {
		return id_Conges;
	}
	public void setId_Conges(Long id_Conges) {
		this.id_Conges = id_Conges;
	}
	public String getAdressC() {
		return adressC;
	}
	public void setAdressC(String adressC) {
		this.adressC = adressC;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Conges(String adressC, Date dateDebut, Date dateFin) {
		super();
		this.adressC = adressC;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public Conges() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
