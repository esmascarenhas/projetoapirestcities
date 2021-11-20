package br.com.esm.findyCity.api;

import br.com.esm.findyCity.domain.enums.EarthRadius;
import br.com.esm.findyCity.domain.service.DistanceService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/distances")
@AllArgsConstructor
@NoArgsConstructor
public class DistanceConroller {



        private DistanceService service;
        Logger log = LoggerFactory.getLogger(DistanceConroller.class);



        @GetMapping("/by-points")
        public Double byPoints(@RequestParam(name = "from") final Long city1,
                               @RequestParam(name = "to") final Long city2) {
            log.info("byPoints");
            return service.distanceByPointsInMiles(city1, city2);
        }

        @GetMapping("/by-cube")
        public Double byCube(@RequestParam(name = "from") final Long city1,
                             @RequestParam(name = "to") final Long city2) {
            log.info("byCube");
            return service.distanceByCubeInMeters(city1, city2);
        }

     /*   @GetMapping("/by-math")
        public Double byMath(@RequestParam(name = "from") final Long city1,
                             @RequestParam(name = "to") final Long city2,
                             @RequestParam final EarthRadius unit) {
            log.info("byMath");
            return service.distanceUsingMath(city1, city2, unit);
        }*/
    }

