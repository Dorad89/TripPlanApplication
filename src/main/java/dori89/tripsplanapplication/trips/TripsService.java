package dori89.tripsplanapplication.trips;

import dori89.tripsplanapplication.trips.models.TripDto;
import dori89.tripsplanapplication.trips.models.TripEntity;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface TripsService {

    List<TripEntity> findAll();
    Optional<TripEntity> findById(long id);
    TripEntity save(TripEntity tripEntity);
    TripEntity update(TripEntity tripEntity);

    void deleteById(long id);

    Set<TripEntity> findByReasonAndOrStatus(long tripReasonId,long tripStatusId);

    TripDto partialUpdate(TripDto tripDto, Long id);
}
