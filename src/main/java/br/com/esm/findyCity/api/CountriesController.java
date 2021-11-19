package br.com.esm.findyCity.api;

import br.com.esm.findyCity.domain.entity.Country;
import br.com.esm.findyCity.domain.repository.CountriesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/countries")
@AllArgsConstructor
public class CountriesController {

    @Autowired
    private CountriesRepository countriesRepository;

/*    @GetMapping
    public List<Country>buscarCountries(){
        return countriesRepository.findAll();
    }*/

    @GetMapping
    public Page<Country>buscarPorPagina(Pageable page){
        return countriesRepository.findAll(page);
    }
 /*   @GetMapping("/{countryid")
    public Country buscarCountry(@PathVariable Long id){
        Optional<Country> optional = countriesRepository.findById(id);
        return optional.get();
    }*/

    @GetMapping("/{countryid}")
    public Country buscarCountry(@PathVariable Long countryid){
        Optional<Country> optional = countriesRepository.findById(countryid);
        return optional.get();
    }




}
