package com.ensam.projets.entity;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name="Conge")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conge {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idConge;
	public Date dateDebut;
	public Date dateFin;
	public String motif;
	@OneToOne
	@JoinColumn(name="document_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	public Document document;
	@OneToOne
	@JoinColumn(name="demandeConge_id")
	public DemandeConge demandeConge;
	

}
