package org.generation.italy.netflixJaita.repository;

import org.generation.italy.netflixJaita.model.Proiezioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RegistiRepository {

	@Repository
	public interface ProiezioniRepository extends JpaRepository<Registi, Integer> {
	}
}
