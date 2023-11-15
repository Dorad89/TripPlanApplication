package dori89.tripsplanapplication.trips;

import java.util.List;
import java.util.Optional;

public interface TripsService {

    List<TripsEntity> findAll();
    Optional<TripsEntity> findById(long id);
    TripsEntity save(TripsEntity tripsEntity);
}
