package com.flight.FlightBookingSystem.dao;

import java.util.List;

import com.flight.FlightBookingSystem.model.Bookings;
import com.flight.FlightBookingSystem.model.User;

public interface UserDao {
	public User loginUser(String username);
	public User bookTickets(String name, int age,String source, String destination);
	public List<Bookings> listOfBookings();
}
