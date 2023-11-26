package dori89.tripsplanapplication.trips;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TripsController {

    private TripsService tripsService;

    @Autowired
    public TripsController(TripsService tripsService) {
        this.tripsService = tripsService;
    }

    @GetMapping(path = "/trips")
    public List<TripEntity> findAll(){

        return tripsService.findAll();
    }

    @GetMapping(path = "/trips/{id}")
    public TripEntity findById(@PathVariable long id){

        Optional<TripEntity> tripsEntityOptional = tripsService.findById(id);

        return tripsEntityOptional.orElse(null);
    }

    @PostMapping(path = "/trips")
    public TripEntity save(@RequestBody TripEntity tripEntity){

        return tripsService.save(tripEntity);
    }
}
