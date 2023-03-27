package it.softwareInside.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Team {

	@Id
	private String nome;
	
	
	private int trofeiVinti;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Allenatore allenatore;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Player> players;
	
}
