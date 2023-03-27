package it.softwareInside.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.models.Team;
@Repository
public interface TeamRepository extends JpaRepository<Team, String> {

}
