package dori89.tripsplanapplication.flights;

import dori89.tripsplanapplication.flights.models.FlightEntity;

import java.util.List;

public interface FlightsService {

    List<FlightEntity> findAll();

    FlightEntity save(FlightEntity flightEntity);

    void deleteById(long id);
}
