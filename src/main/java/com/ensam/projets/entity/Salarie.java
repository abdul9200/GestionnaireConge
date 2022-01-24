package com.ensam.projets.entity;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Salarie")

public class Salarie  {
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idSalarie;	
	public String nom;
	public String prenom;
	public Date DateEmbauche;
	public String Login;
	@Enumerated(EnumType.STRING)
	public Fonction fonction;
	public String email;
	public String tel;
	public int Solde;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="groupe_id")
	public Groupe groupe;
	@OneToMany(mappedBy="salarie", cascade = CascadeType.ALL)
	public Collection<DemandeConge> demandes= new ArrayList<>();
	@OneToMany(mappedBy="salarie", cascade = CascadeType.ALL)
	public Collection<Document> document=new ArrayList<>();
	/*
	public Salarie(int idSalarie, String nom, String email, String tel, String prenom, Date dateEmbauche,
			 Groupe groupe) {
		super();
		this.idSalarie = idSalarie;
		this.nom = nom;
		this.email = email;
		this.tel = tel;
		this.prenom = prenom;
		DateEmbauche = dateEmbauche;
		this.fonction = Fonction.Salarié;
		this.groupe = groupe;
	}*/
	
	
	
	
}

