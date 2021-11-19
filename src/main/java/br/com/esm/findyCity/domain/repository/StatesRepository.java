package br.com.esm.findyCity.domain.repository;

import br.com.esm.findyCity.domain.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatesRepository extends JpaRepository<State, Long> {
}
