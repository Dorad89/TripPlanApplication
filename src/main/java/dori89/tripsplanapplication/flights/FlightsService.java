package dori89.tripsplanapplication.flights;

import java.util.List;

public interface FlightsService {

    List<FlightEntity> findAll();

    FlightEntity save(FlightEntity flightEntity);

    void deleteById(long id);
}
