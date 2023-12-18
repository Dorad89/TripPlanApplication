package dori89.tripsplanapplication.trips.models;

import dori89.tripsplanapplication.commons.BaseDto;

import java.util.Date;

public class TripDto extends BaseDto {

    private String tripDescription;
    private String departureCity;
    private String destinationCity;
    private Date departureDate;
    private Date arrivalDate;
    private String status;
    private long tripStatusId;

    private long tripReasonId;

    public String getTripDescription() {
        return tripDescription;
    }

    public void setTripDescription(String tripDescription) {
        this.tripDescription = tripDescription;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public long getTripStatusId() {
        return tripStatusId;
    }

    public void setTripStatusId(long tripStatusId) {
        this.tripStatusId = tripStatusId;
    }

    public long getTripReasonId() {
        return tripReasonId;
    }

    public void setTripReasonId(long tripReasonId) {
        this.tripReasonId = tripReasonId;
    }
}
