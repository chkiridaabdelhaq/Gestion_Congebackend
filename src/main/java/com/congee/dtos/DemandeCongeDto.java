package com.congee.dtos;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class DemandeCongeDto {

	private Long id_DemandeC;
	private String numeroDemande;
	private String adressD;
	private Date dateDebut;
	private Date dateFin;
	public Long getId_DemandeC() {
		return id_DemandeC;
	}
	public void setId_DemandeC(Long id_DemandeC) {
		this.id_DemandeC = id_DemandeC;
	}
	public String getNumeroDemande() {
		return numeroDemande;
	}
	public void setNumeroDemande(String numeroDemande) {
		this.numeroDemande = numeroDemande;
	}
	public String getAdressD() {
		return adressD;
	}
	public void setAdressD(String adressD) {
		this.adressD = adressD;
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
	public DemandeCongeDto(String numeroDemande, String adressD, Date dateDebut, Date dateFin) {
		super();
		this.numeroDemande = numeroDemande;
		this.adressD = adressD;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public DemandeCongeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
