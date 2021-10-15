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
public class DemandeConge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_DemandeC;
	private String numeroDemande;
	private String adressD;
	private Date dateDebut;
	private Date dateFin;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_DC_Etat")
	private EtatDemande demande;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_employer_demande")
	private Employes employes;
	
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
	public DemandeConge(String numeroDemande, String adressD, Date dateDebut, Date dateFin) {
		super();
		this.numeroDemande = numeroDemande;
		this.adressD = adressD;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public DemandeConge() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
