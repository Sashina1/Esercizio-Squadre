package it.softwareInside.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.models.Team;
import it.softwareInside.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	TeamService ts;
	
	
	@PostMapping("/addTeam")
	public boolean addTeam(@RequestBody Team team) {
		
		  ts.addTeam(team);
		return true;
	}
	
	
	
	@DeleteMapping("/deleteID")
	public void deleteById(@RequestParam("id") String cognome) {
		
		ts.deletebyId(cognome);
	}
	
	
	@DeleteMapping("/deleteAll")
	public void deleteAll(@RequestParam("id") String cognome) {
		
		ts.deleteAll();
	}
	
	
	
	@GetMapping("/find1")
	public boolean findByID(@RequestParam("id") String cognome) {
		
		 return ts.findByID(cognome);
		
	}
	
	
	@GetMapping("/findAll")
	public Iterable<Team> findAll() {
		
		return ts.findAll();
	}
	
	
}
