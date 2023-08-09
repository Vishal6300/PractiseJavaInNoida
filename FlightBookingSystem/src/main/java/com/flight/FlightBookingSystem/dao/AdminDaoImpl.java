package com.flight.FlightBookingSystem.dao;

import java.util.List;

import com.flight.FlightBookingSystem.Exceptions.AdminException;
import com.flight.FlightBookingSystem.Exceptions.BookingExceptions;
import com.flight.FlightBookingSystem.Exceptions.UserException;
import com.flight.FlightBookingSystem.model.Admin;
import com.flight.FlightBookingSystem.model.Bookings;
import com.flight.FlightBookingSystem.model.User;

public class AdminDaoImpl implements AdminDao{

	@Override
	public Admin loginAdmin(String username, String password) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	public static String registerFlight(String flightName,String source, String destination, String type, int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUser() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getUsers() throws BookingExceptions {
		// TODO Auto-generated method stub
		return null;
	}

}
