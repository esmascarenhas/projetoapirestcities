package br.com.esm.findyCity.api;

import br.com.esm.findyCity.domain.entity.City;
import br.com.esm.findyCity.domain.repository.CitiesRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/v1/cities")
public class CitiesController {

    @Autowired
    private CitiesRepository citiesRepository;


 /*   @GetMapping
    public List<City>buscarCities(){
        return citiesRepository.findAll();
    }*/

    @GetMapping
    public Page<City> buscarCitiesPorPagina(Pageable page){
        return citiesRepository.findAll(page);
    }




}
