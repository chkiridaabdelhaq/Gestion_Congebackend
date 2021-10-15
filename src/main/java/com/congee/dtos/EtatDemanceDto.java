package com.congee.dtos;

import org.springframework.stereotype.Component;

@Component
public class EtatDemanceDto {

	private Long id_TypeD;
	private String codeLibelle;
	
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
	public EtatDemanceDto(String codeLibelle) {
		super();
		this.codeLibelle = codeLibelle;
	}
	public EtatDemanceDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
