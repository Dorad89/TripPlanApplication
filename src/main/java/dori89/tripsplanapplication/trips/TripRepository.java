package dori89.tripsplanapplication.trips;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<TripsEntity, Long> {
}
