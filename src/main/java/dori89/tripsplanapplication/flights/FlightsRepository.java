package dori89.tripsplanapplication.flights;

import dori89.tripsplanapplication.flights.models.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepository extends JpaRepository <FlightEntity, Long> {

}
