package com.consoleproject;

import java.util.Scanner;

public class RestaurantService {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		double totalBill = 0;

		System.out.println("===== Welcome to Hemanth Restaurant =====");

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Burger - $120");
			System.out.println("2. Pizza - $250");
			System.out.println("3. Pasta - $180");
			System.out.println("4. Coffee - $80");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			int quantity;

			switch (choice) {

			case 1:
				System.out.print("Enter quantity: ");
				quantity = sc.nextInt();
				totalBill += 120 * quantity;
				System.out.println("Burger added successfully!");
				break;

			case 2:
				System.out.print("Enter quantity: ");
				quantity = sc.nextInt();
				totalBill += 250 * quantity;
				System.out.println("Pizza added successfully!");
				break;

			case 3:
				System.out.print("Enter quantity: ");
				quantity = sc.nextInt();
				totalBill += 180 * quantity;
				System.out.println("Pasta added successfully!");
				break;

			case 4:
				System.out.print("Enter quantity: ");
				quantity = sc.nextInt();
				totalBill += 80 * quantity;
				System.out.println("Coffee added successfully!");
				break;

			case 5:
				System.out.println("\nOrder confirmed successfully!");
				System.out.println("Total Bill: ₹" + totalBill);
				System.out.println("Thank you! Visit Again");
				break;

			default:
				System.out.println("Invalid choice! Please try again.");
			}

		} while (choice != 5);

		sc.close();
	}
}
