package dori89.tripsplanapplication.trips;

import java.util.List;
import java.util.Optional;

public interface TripsService {

    List<TripEntity> findAll();
    Optional<TripEntity> findById(long id);
    TripEntity save(TripEntity tripEntity);
    TripEntity update(TripEntity tripEntity);

    void deleteById(long id);
}
