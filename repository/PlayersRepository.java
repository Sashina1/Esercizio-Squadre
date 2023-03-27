package it.softwareInside.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.models.Player;
@Repository
public interface PlayersRepository extends JpaRepository<Player, String>{

}
