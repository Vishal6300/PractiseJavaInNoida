package com.flight.FlightBookingSystem.UseCases;

import java.util.Scanner;

import com.flight.FlightBookingSystem.Exceptions.BookingExceptions;
import com.flight.FlightBookingSystem.Exceptions.UserException;
import com.flight.FlightBookingSystem.Util.ConsoleColors;
import com.flight.FlightBookingSystem.dao.AdminDao;
import com.flight.FlightBookingSystem.dao.AdminDaoImpl;
import com.flight.FlightBookingSystem.dao.BookingDao;
import com.flight.FlightBookingSystem.dao.BookingDaoImpl;
import com.flight.FlightBookingSystem.dao.UserDao;
import com.flight.FlightBookingSystem.dao.UserDaoImpl;

public class Main {
	public static void main(String[] args) throws UserException, BookingExceptions {
		System.out.println(ConsoleColors.BLUE);
		System.out.println("Welcome to SpiceJet Airticket Booking System.");
		System.out.println("=====================================================");
		System.out.println("Enter 1 for Admin Login.");
		System.out.println("Enter 2 for User Login.");
		System.out.println("Enter 4 for exit");
		System.out.println(ConsoleColors.RESET);
		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();

		System.out.println("================================");

		switch (choice) {
			// case 1 for admin login
			case 1:
				System.out.println("Admin");
				System.out.println("=============================");
				AdminLoginUsecase login = new AdminLoginUsecase();
				login.useLoginAdmin();

				while (true) {
					System.out.println("Enter 1 : Add New Flight.");
					System.out.println("Enter 2 : see the list of all flight.");
					System.out.println("Enter 3 : see the list of all Users");
					System.out.println("Enter 4 : see all bookings");
					System.out.println("Enter 5 : logout");

					int adminChoice = sc.nextInt();
					System.out.println("===================================");

					if (adminChoice == 1) {
						AdminRegisterNewFlight reg = new AdminRegisterNewFlight();
						System.out.println("Add New Flight.");
						System.out.println("=============================================");
						reg.adminRegisterFlight();
					}

					else if (adminChoice == 2) {
						AdminDao check = new AdminDaoImpl();
						System.out.println("flight List");
						System.out.println("=================================");
						check.getUsers();
					}

					else if (adminChoice == 3) {
						AdminDao dlt = new AdminDaoImpl();
						System.out.println("User List");
						dlt.getUsers();
						System.out.println("====================================");
					}

					else if (adminChoice == 4) {
						BookingDao check = new BookingDaoImpl();
						System.out.println("Booking List");
						System.out.println("=================================");
						check.ViewAllBookings();
						System.out.println("=====================================");
					}

					else if (adminChoice == 5) {
						Main.main(args);
					}

					else {
						System.out.println(ConsoleColors.RED + "Invalid choice. Please enter a correct choice."
								+ ConsoleColors.RESET);
						System.out.println("====================================================");

					}
				}
				// case 2 for User login
			case 2:
				while (true) {
					System.out.println("User.");
					System.out.println("==================================================");
					System.out.println("Enter 1 to login if you are already registered.");
					System.out.println("Enter 2 to register to the system if you are a new user.");
					System.out.println("Enter 3 to exit.");

					int empChoiceLogin = sc.nextInt();
					if (empChoiceLogin == 1) {
						UserLogin userLogin = new UserLogin();
						int userIdLoggedin = userLogin.loginUser();

						while (true) {
							System.out.println("Enter 1 to check the pricelist.");
							System.out.println("Enter 2 to add the journey.");
							System.out.println("Enter 3 to check booking list.");
							System.out.println("Enter 4 to logout.");

							int empChoice = sc.nextInt();
							System.out.println("==========================================");
							System.out.println("User.");
							System.out.println("===========================================");
							if (empChoice == 1) {
								System.out.println("check the pricelist.");
								System.out.println("=======================================");
								System.out.println("Delhi to Kolkata");
								System.out.println("Price: 4454.00 (Including Tax)");
								System.out.println("Delhi to Chennai");
								System.out.println("Price: 5654.00 (Including Tax)");
								System.out.println("========================================");
							} else if (empChoice == 2) {
								System.out.println("add the journey");
								System.out.println("Enter name");
								String name=sc.next();
								System.out.println("Enter age");
								int age=sc.nextInt();
								System.out.println("Enter source station name");
								String source=sc.next();
								System.out.println("Enter destination station name");
								String destination=sc.next();
								
								UserDao book = new UserDaoImpl();
								book.bookTickets(name, age, source, destination);
								System.out.println("==========================================");
							} else if (empChoice == 3) {
								BookingDao check = new BookingDaoImpl();
								System.out.println("Booking List");
								System.out.println("=================================");
								check.ViewAllBookings();
								System.out.println("=============================================");
							}  else if (empChoice == 4) {
								main(args);
							}
						}

					} else if (empChoiceLogin == 2) {
						UserDao userRegister = new UserDaoImpl();
						userRegister.loginUser(null);
						System.out.println("============================================");
					} else if (empChoiceLogin == 3) {
						System.out.println("*****************************************");
						System.out.println("Thank you.");
						System.exit(0);
					} else {
						System.out.println("Invalid choice. Please try again.");
					}
				}
				
			case 4:
				System.out.println(ConsoleColors.YELLOW + "Thank you." + ConsoleColors.RESET);
				System.exit(0);

			default:
				System.out.println(ConsoleColors.RED + "Invalid choice" + ConsoleColors.RESET);
				// System.exit(0);
				main(args);
		}
	}

}
