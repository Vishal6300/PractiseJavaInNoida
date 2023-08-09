package com.flight.FlightBookingSystem.UseCases;

import java.util.Scanner;

import com.flight.FlightBookingSystem.Exceptions.AdminException;
import com.flight.FlightBookingSystem.dao.AdminDao;
import com.flight.FlightBookingSystem.dao.AdminDaoImpl;

public class AdminRegisterNewFlight {
	// Here Admin can add new Flights
		public void adminRegisterFlight() {
			String res = "Some entries are invalid. Please try again.";

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Flight name");
			String flightName = sc.next();
			System.out.println("Enter source name");
			String source = sc.next();
			System.out.println("Enter destination name");
			String destination = sc.next();
			// chhosing which type of Seats it is
			System.out.println("Enter 1 for Economy class");
			System.out.println("Enter 2 for Business class");
			int typeChoice = sc.nextInt();

			String type = "";

			if (typeChoice == 1) {
				type = "Economy class";
			} else if (typeChoice == 2) {
				type = "Business class";
			} else {
				System.out.println("Invalid choice. Please try again.");
				adminRegisterFlight();
			}

			System.out.println("Enter Price according to class");
			int price = sc.nextInt();

			System.out.println("==============================================");

			AdminDao dao = new AdminDaoImpl();

			res = AdminDao.registerFlight(flightName, source, destination, type, price);
			System.out.println(res);
			System.out.println("====================================");
		}

}
