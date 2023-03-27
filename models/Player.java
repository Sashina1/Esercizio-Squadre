package it.softwareInside.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Player {

	@Id
	private String cognome;
	
	private String ruolo;
	
	private int eta;
	
}
