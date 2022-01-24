package com.ensam.projets.entity;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name="DemandeConge")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemandeConge {
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idDemande;
	public Date dateDemande;
	public String etat;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="salarie_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	public Salarie salarie;
	@OneToOne (mappedBy="demandeConge")
	public Conge conge;
	
	

}
