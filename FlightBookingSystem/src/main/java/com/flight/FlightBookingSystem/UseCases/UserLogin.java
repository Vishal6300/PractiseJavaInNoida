package com.flight.FlightBookingSystem.UseCases;

import java.util.Base64;
import java.util.Scanner;

import com.flight.FlightBookingSystem.Exceptions.UserException;
import com.flight.FlightBookingSystem.Util.ConsoleColors;
import com.flight.FlightBookingSystem.dao.UserDao;
import com.flight.FlightBookingSystem.dao.UserDaoImpl;
import com.flight.FlightBookingSystem.model.User;

public class UserLogin {
	// User login method
	// taking input of username and password from user to login
		public int loginUser() throws UserException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Username");
			String username = sc.next();
			System.out.println("Enter Password");
			String password = sc.next();
			System.out.println("==================================");

			UserDao dao = new UserDaoImpl();
			int userId=0;
			User user = dao.loginUser(username);
			byte[] decodedBytes = Base64.getDecoder().decode(user.getPassword());
			String decodedString = new String(decodedBytes);
			if (decodedString.equals(password)) {
				System.out.println(
						ConsoleColors.GREEN_BACKGROUND_BRIGHT + "Welcome " + user.getName() + ConsoleColors.RESET);

				System.out.println("======================================");
				 userId = user.getUserId();
			} else {
				System.out.println(ConsoleColors.RED);
				System.out.println("Invalid password. Please try again");

				System.out.println("===========================================");
				System.out.println(ConsoleColors.RESET);
				loginUser();
			}

			return userId;
		}


}
