package com.congee.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EtatDemande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_TypeD;
	private String codeLibelle;
	
	@OneToMany(mappedBy = "demande")
	private Collection<DemandeConge> demandeConges;
	
	public Long getId_TypeD() {
		return id_TypeD;
	}
	public void setId_TypeD(Long id_TypeD) {
		this.id_TypeD = id_TypeD;
	}
	public String getCodeLibelle() {
		return codeLibelle;
	}
	public void setCodeLibelle(String codeLibelle) {
		this.codeLibelle = codeLibelle;
	}
	public EtatDemande(String codeLibelle) {
		super();
		this.codeLibelle = codeLibelle;
	}
	public EtatDemande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
