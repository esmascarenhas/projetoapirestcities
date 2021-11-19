package br.com.esm.findyCity.domain.repository;

import br.com.esm.findyCity.domain.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Country,Long> {
}
