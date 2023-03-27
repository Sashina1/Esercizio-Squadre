package it.softwareInside.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.models.Allenatore;
@Repository
public interface AllenatoreRepository extends JpaRepository<Allenatore, String> {

}
