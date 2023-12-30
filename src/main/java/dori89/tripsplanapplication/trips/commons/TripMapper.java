package dori89.tripsplanapplication.trips.commons;

import dori89.tripsplanapplication.trips.models.TripDto;
import dori89.tripsplanapplication.trips.models.TripEntity;
import jakarta.persistence.SecondaryTable;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface TripMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void mapDtoToEntity(TripDto source, @MappingTarget TripEntity target);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void mapEntityToDto(TripEntity source, @MappingTarget TripDto target);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TripDto mapEntityToDto(TripEntity tripEntity);

    Set<TripDto> mapEntitiesToDto(Set<TripEntity> sourceList);
}
