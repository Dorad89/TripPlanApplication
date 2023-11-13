package dori89.tripsplanapplication.trips;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TripController {

    private TripsRepository tripsRepository;

    @Autowired
    public TripController(TripsRepository tripsRepository) {
        this.tripsRepository = tripsRepository;
    }

    @GetMapping(path = "/trips")
    public List<TripsEntity> findAll(){

        return tripsRepository.findAll();
    }

    @GetMapping(path = "/trips/{id}")
    public TripsEntity findById(@PathVariable long id){

        Optional<TripsEntity> tripsEntityOptional = tripsRepository.findById(id);

        return tripsEntityOptional.orElse(null);
    }

    @PostMapping(path = "/trips")
    public TripsEntity save(@RequestBody TripsEntity tripsEntity){

        return tripsRepository.save(tripsEntity);
    }
}
