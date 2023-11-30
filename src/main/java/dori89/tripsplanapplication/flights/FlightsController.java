package dori89.tripsplanapplication.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping(path = "flights/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletedById(@PathVariable long id){

        flightsService.deleteById(id);
    }
}
