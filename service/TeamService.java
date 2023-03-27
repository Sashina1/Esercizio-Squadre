package it.softwareInside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.models.Team;
import it.softwareInside.repository.AllenatoreRepository;
import it.softwareInside.repository.PlayersRepository;
import it.softwareInside.repository.TeamRepository;

@Service
public class TeamService {

	
	@Autowired
	TeamRepository tr;
	@Autowired
	PlayersRepository pr;
	@Autowired
	AllenatoreRepository ar;
	
	
	
	public boolean addTeam(Team team) {
		try {
			tr.save(team);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	
	
	
	public void deletebyId(String cognome) {
		
		tr.deleteById(cognome);
		
	}
	
	
	public void deleteAll() {
		tr.deleteAll();
	}
	
	
	
	public boolean findByID(String cognome) {
		
		try {
			tr.findById(cognome);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	public Iterable<Team>  findAll() {
		
		return  tr.findAll();
	}
	
	
	
	
	
}
