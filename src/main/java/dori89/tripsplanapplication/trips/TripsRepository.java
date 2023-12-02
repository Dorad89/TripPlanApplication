package dori89.tripsplanapplication.trips;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TripsRepository extends JpaRepository<TripEntity, Long> {

    Set<TripEntity> findByTripReasonId(long tripReasonId);
}
