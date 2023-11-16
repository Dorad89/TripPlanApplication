package dori89.tripsplanapplication.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightsController {

    private FlightsService flightsService;
    @Autowired
    public FlightsController(FlightsService flightsService) {
        this.flightsService = flightsService;
    }

    @GetMapping(path = "/flights")
    public List<FlightEntity> findAll(){

        return flightsService.findAll();
    }

    @PostMapping(path = "/flights")
    public FlightEntity save(@RequestBody FlightEntity flightEntity){

        return flightsService.save(flightEntity);
    }
}
