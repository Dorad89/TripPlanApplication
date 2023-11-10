package dori89.tripsplanapplication.trips;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TripsRepository extends JpaRepository<TripsEntity, Long> {
}
