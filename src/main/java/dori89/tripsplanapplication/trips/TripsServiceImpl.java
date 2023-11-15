package dori89.tripsplanapplication.trips;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripsServiceImpl implements TripsService{


    private TripsRepository tripsRepository;
    @Autowired
    public TripsServiceImpl(TripsRepository tripsRepository) {
        this.tripsRepository = tripsRepository;
    }

    @Override
    public List<TripsEntity> findAll() {
        return tripsRepository.findAll();
    }

    @Override
    public Optional<TripsEntity> findById(long id) {
        return tripsRepository.findById(id);
    }

    @Override
    public TripsEntity save(TripsEntity tripsEntity) {
        return tripsRepository.save(tripsEntity);
    }
}
