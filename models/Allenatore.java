package it.softwareInside.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Allenatore {

	@Id
	private String nomeCognome;
	
	private int eta;
	
    
}
