package dori89.tripsplanapplication.trips;

import dori89.tripsplanapplication.trips.commons.TripMapper;
import dori89.tripsplanapplication.trips.models.TripDto;
import dori89.tripsplanapplication.trips.models.TripEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TripsServiceImpl implements TripsService{


    private TripsRepository tripsRepository;
    private TripMapper tripMapper;
    @Autowired
    public TripsServiceImpl(TripsRepository tripsRepository, TripMapper tripMapper) {
        this.tripsRepository = tripsRepository;
        this.tripMapper = tripMapper;
    }

    @Override
    public List<TripEntity> findAll() {
        return tripsRepository.findAll();
    }

    @Override
    public Optional<TripEntity> findById(long id) {
        return tripsRepository.findById(id);
    }

    @Override
    public TripEntity save(TripEntity tripEntity) {
        return tripsRepository.save(tripEntity);
    }

    @Override
    public TripEntity update(TripEntity tripEntity) {

        tripEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        //tripEntity.setUpdatedBy(userEntity.getId);
        return tripsRepository.save(tripEntity);
    }

    @Override
    public void deleteById(long id) {

        Optional<TripEntity> tripEntityOptional = tripsRepository.findById(id);

        if (tripEntityOptional.isPresent()){

         //tripsRepository.deleteById(id);
            TripEntity tripEntity = tripEntityOptional.get();
            tripEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            //tripEntity.setUpdatedBy(userEntity.getId);
            tripEntity.setStatus("Deleted");
            tripsRepository.save(tripEntity);

        } else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student with id " + id + " not found!");
    }

    @Override
    public Set<TripEntity> findByReasonAndOrStatus(long tripReasonId, long tripStatusId) {
       return tripsRepository.findByTripReasonIdOrTripStatusId(tripReasonId, tripStatusId);
    }

    @Override
    public TripDto partialUpdate(TripDto tripDto, Long id) {

        Optional <TripEntity> tripEntityOptional = tripsRepository.findById(id);
        if (tripEntityOptional.isPresent()){

            TripEntity tripEntity = tripEntityOptional.get();

            tripMapper.mapDtoToEntity(tripDto, tripEntity);

            tripEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            //tripEntity.setUpdatedBy(userEntity.getId);

            TripEntity patchedEntity = tripsRepository.save(tripEntity);

            return tripMapper.mapEntityToDto(patchedEntity);
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Trip with id " + id + " did not found. ");
        }

    }
}
