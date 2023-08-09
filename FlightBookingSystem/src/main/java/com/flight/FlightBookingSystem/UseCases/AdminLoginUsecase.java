package com.flight.FlightBookingSystem.UseCases;

import java.util.Scanner;

import com.flight.FlightBookingSystem.Exceptions.AdminException;
import com.flight.FlightBookingSystem.Util.ConsoleColors;
import com.flight.FlightBookingSystem.dao.AdminDao;
import com.flight.FlightBookingSystem.dao.AdminDaoImpl;
import com.flight.FlightBookingSystem.model.Admin;

public class AdminLoginUsecase {
	public void useLoginAdmin() {

		// Taking input of username and password
		Scanner sc = new Scanner(System.in);
		System.out.println(ConsoleColors.CYAN_BACKGROUND);
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		System.out.println(ConsoleColors.RESET);
		System.out.println("==================================");

		AdminDao dao = new AdminDaoImpl();

		try {
			Admin admin = dao.loginAdmin(username, password);
			System.out.println("Welcome " + admin.getAdminName());
			System.out.println("======================================");

		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("===========================================");
			useLoginAdmin();
		}
	}

}
