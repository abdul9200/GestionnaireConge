package com.ensam.projets.entity;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name="Document")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Document {
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idDocument;
	public Date date;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="salarie_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	public Salarie salarie;
	@OneToOne (mappedBy="document")
	public Conge conge;

}
