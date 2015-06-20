package com.telecommunication;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Choose your Language!!!\n 1. English\n 2. Hindi");

		userInput.hasNextInt();
		int language = userInput.nextInt();

		if (language == 1) {
			while (true) {
				System.out.println("To know your bill press 1");
				System.out.println("For porting request press 2");
				System.out
						.println("To talk to our customer care executive press 3");
				System.out.println("To exit press 0");

				userInput.hasNextInt();
				int choice = userInput.nextInt();

				if (choice == 0) {
					System.out.println("thanks for Calling");
					System.exit(0);
				}

				switch (choice) {

				case 1:
					System.out.println("Your bill is Rs.800\n");
					System.out.println("To go back to previous menu press 9");
					System.out.println("To exit press 0\n");
					userInput.hasNextInt();
					int internal1Choice = userInput.nextInt();
					if (internal1Choice == 9) {
						continue;
					} else {
						System.out.println("thanks for Calling\n");
						System.exit(0);
					}

				case 2:
					System.out.println("Your porting request is under process\n");
					System.out.println("To go back to previous menu press 9");
					System.out.println("To exit press 0\n");
					userInput.hasNextInt();
					int internal2Choice = userInput.nextInt();
					if (internal2Choice == 9) {
						continue;
					} else {
						System.out.println("thanks for Calling\n");
						System.exit(0);
					}

				case 3:
					System.out
							.println("All our executive are busy.\nPlease try again later\n");
					System.out.println("To go back to previous menu press 9");
					System.out.println("To exit press 0\n");
					userInput.hasNextInt();
					int internal3Choice = userInput.nextInt();
					if (internal3Choice == 9) {
						continue;
					} else {
						System.out.println("thanks for Calling");
						System.exit(0);
					}

				}

			}
		} else if (language == 2) {
			while (true) {
				System.out.println(" Apna bill janne k lie 1 dabayein");
				System.out.println(" Porting request k lie 2 dabayein");
				System.out
						.println(" Customer care executive se baat krne k lie 3 dabayein");
				System.out.println("Call samapti k lie 0 dabayein\n");
				
				
				userInput.hasNextInt();
				int choice = userInput.nextInt();

				if (choice==0){
					System.out.println("Call karne k lie dhanyavaad...");
					System.exit(0);
				}
					
				
				switch (choice) {

				case 1:
					System.out.println(" Aapka bill hai Rs.800\n");
					System.out
							.println("Pichle menu me wapas jane k lie 9 dabayein");
					System.out.println("Call samapti k lie 0 dabayein\n");
					userInput.hasNextInt();
					int internal1Choice = userInput.nextInt();
					if (internal1Choice == 9) {
						continue;
					} else {
						System.out.println("Call karne k lie dhanyavaad....");
						System.exit(0);
					}

				case 2:
					System.out
							.println("Aapki porting request process ho ri h.\nKripya prateeksha kare\n");
					System.out
							.println("Pichle menu me wapas jane k lie 9 dabayein");
					System.out.println("Call samapti k lie 0 dabayein\n");
					userInput.hasNextInt();
					int internal2Choice = userInput.nextInt();
					if (internal2Choice == 9) {
						continue;
					} else {
						System.out.println("Call karne k lie dhanyavaad....");
						System.exit(0);
					}

				case 3:
					System.out
							.println("Hmare sabhi executive vyast h\nKripya thodi der bad Call kare\n");
					System.out
							.println("Pichle menu me wapas jane k lie 9 dabayein");
					System.out.println("Call samapti k lie 0 dabayein\n");
					userInput.hasNextInt();
					int internal3Choice = userInput.nextInt();
					if (internal3Choice == 9) {
						continue;
					} else {
						System.out.println("Call karne k lie dhanyavaad....");
						System.exit(0);
					}

				}
			}

		} else {
			System.out.println("Please choose correct option!!!");
		}
		userInput.close();
	}

}
