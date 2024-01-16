package org.generation.italy.netflixJaita.repository;

import java.time.LocalDate;
import java.util.List;

import org.generation.italy.netflixJaita.model.Proiezioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProiezioniRepository extends JpaRepository<Proiezioni,Integer>{

}
