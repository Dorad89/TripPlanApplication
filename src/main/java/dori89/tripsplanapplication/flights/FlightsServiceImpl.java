package dori89.tripsplanapplication.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
