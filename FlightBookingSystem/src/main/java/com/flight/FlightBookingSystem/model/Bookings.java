package com.flight.FlightBookingSystem.model;

import java.time.LocalDate;

public class Bookings {
	private Integer BookingId;
	private String firstPersonName;
	private String SecondPersonName;
	private String source;
	private String destination;
	private String flightName;
	private LocalDate departureDate;
	private String travelClass;
	
	
	public Integer getBookingId() {
		return BookingId;
	}
	public void setBookingId(Integer bookingId) {
		BookingId = bookingId;
	}
	public String getFirstPersonName() {
		return firstPersonName;
	}
	public void setFirstPersonName(String firstPersonName) {
		this.firstPersonName = firstPersonName;
	}
	public String getSecondPersonName() {
		return SecondPersonName;
	}
	public void setSecondPersonName(String secondPersonName) {
		SecondPersonName = secondPersonName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public String getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}
	
	public Bookings(Integer bookingId, String firstPersonName, String secondPersonName, String source,
			String destination, String flightName, LocalDate departureDate, String travelClass) {
		super();
		BookingId = bookingId;
		this.firstPersonName = firstPersonName;
		SecondPersonName = secondPersonName;
		this.source = source;
		this.destination = destination;
		this.flightName = flightName;
		this.departureDate = departureDate;
		this.travelClass = travelClass;
	}
	
	@Override
	public String toString() {
		return "Bookings [BookingId=" + BookingId + ", firstPersonName=" + firstPersonName + ", SecondPersonName="
				+ SecondPersonName + ", source=" + source + ", destination=" + destination + ", flightName="
				+ flightName + ", departureDate=" + departureDate + ", travelClass=" + travelClass + "]";
	}
	
	
}
