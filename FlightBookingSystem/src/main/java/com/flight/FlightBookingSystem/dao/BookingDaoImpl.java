package com.flight.FlightBookingSystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.flight.FlightBookingSystem.UseCases.BookingList;
import com.flight.FlightBookingSystem.model.Bookings;

public class BookingDaoImpl implements BookingDao{

	@Override
	public List<Bookings> ViewAllBookings() {
		// This method is returning a list of booking that is booked by a single user
			

					List<Bookings> comps = new ArrayList<>();

					BookingDao dao = new BookingDaoImpl();

					try {
						comps = dao.ViewAllBookings();
						comps.forEach(comp -> System.out.println(comp));
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
				return comps;
	}

}
