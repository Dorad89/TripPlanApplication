package dori89.tripsplanapplication.flights;

import dori89.tripsplanapplication.flights.models.FlightEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class FlightsServiceImpl implements FlightsService{

    private FlightsRepository flightsRepository;
    @Autowired
    public FlightsServiceImpl(FlightsRepository flightsRepository) {
        this.flightsRepository = flightsRepository;
    }

    @Override
    public List<FlightEntity> findAll() {
        return flightsRepository.findAll();
    }

    @Override
    public FlightEntity save(FlightEntity flightEntity) {
        return flightsRepository.save(flightEntity);
    }

    @Override
    public void deleteById(long id) {
        Optional<FlightEntity> flightEntityOptional = flightsRepository.findById(id);

       if (flightEntityOptional.isPresent()){
           FlightEntity flightEntity = flightEntityOptional.get();

           flightEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
           flightEntity.setStatus("Deleted");
           flightsRepository.save(flightEntity);
           //flightsRepository.deleteById(id);

       } else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Flight with id " + id + " not found!");
    }
}
