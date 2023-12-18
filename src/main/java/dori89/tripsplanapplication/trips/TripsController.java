package dori89.tripsplanapplication.trips;

import dori89.tripsplanapplication.trips.models.TripEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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

    @PutMapping(path = "/trips/{id}")
    public TripEntity update(@RequestBody TripEntity tripEntity, @PathVariable long id){

        tripEntity.setId(id);
        return tripsService.update(tripEntity);
    }
    @DeleteMapping(path = "trips/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){

        tripsService.deleteById(id);
    }

    @GetMapping(path = "/trips", params = "tripReasonId")
    public Set<TripEntity> findByReasonAndOrStatus(@RequestParam long tripReasonId,@RequestParam(required = false) long tripStatusId){
        return tripsService.findByReasonAndOrStatus(tripReasonId,tripStatusId);
    }
}
