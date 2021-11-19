package br.com.esm.findyCity.api;

import br.com.esm.findyCity.domain.entity.State;
import br.com.esm.findyCity.domain.repository.StatesRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/states")
@AllArgsConstructor
public class StatesController {

    private StatesRepository statesRepository;

    @GetMapping
    public List<State> listStates(){
        return statesRepository.findAll();
    }

    @GetMapping("/{stateid}")
    public Optional<State> findByStates(@PathVariable Long stateid){
        return statesRepository.findById(stateid);
    }

}
