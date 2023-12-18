package dori89.tripsplanapplication.trips;

import dori89.tripsplanapplication.trips.models.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TripsRepository extends JpaRepository<TripEntity, Long> {

    Set<TripEntity> findByTripReasonIdOrTripStatusId(long tripReasonId,long tripStatusId);
}
