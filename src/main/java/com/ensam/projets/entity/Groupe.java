package com.ensam.projets.entity;

import java.util.ArrayList;
import java.util.Collection;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Groupes")

public class Groupe {
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)

	public int idGroupe;
	public String nomDuGroupe;
	@OneToMany(mappedBy="groupe", cascade = CascadeType.ALL)
	public Collection<Salarie> salaries = new ArrayList<>();
	
	

}
