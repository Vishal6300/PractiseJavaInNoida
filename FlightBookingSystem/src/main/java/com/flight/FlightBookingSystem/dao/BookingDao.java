package com.flight.FlightBookingSystem.dao;

import java.util.List;

import com.flight.FlightBookingSystem.model.Bookings;

public interface BookingDao {
	
		public List<Bookings> ViewAllBookings();
}
