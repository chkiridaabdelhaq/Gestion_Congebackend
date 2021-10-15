package com.congee.dtos;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class CongesDto {
	
	private Long id_Conges;
	private String adressC;
	private Date dateDebut;
	private Date dateFin;
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
	public CongesDto(String adressC, Date dateDebut, Date dateFin) {
		super();
		this.adressC = adressC;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public CongesDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
