package dori89.tripsplanapplication.trips;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
