package br.com.esm.findyCity.domain.service;

import br.com.esm.findyCity.common.StringLocationUtils;
import br.com.esm.findyCity.domain.entity.City;
import br.com.esm.findyCity.domain.enums.EarthRadius;
import br.com.esm.findyCity.domain.repository.CitiesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import static java.lang.Math.atan2;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.toRadians;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class CitiesService {


    private final CitiesRepository citiesRepository;

    }
