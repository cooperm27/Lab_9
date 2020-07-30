
import java.util.Scanner;

public class Validator {
	
	

	public static int getInt(Scanner scnr, String prompt) {
		System.out.println(prompt);
		while (!scnr.hasNextInt()) {
			scnr.nextLine(); 
			System.out.println("Number must be a whole number between 1 and 10. Please try again.");
			
		}
		int input = scnr.nextInt();
		scnr.nextLine(); // <-- clear entire line to ready for next input
		return input;
	}
	
	public static int getPositiveInt(Scanner scnr, String prompt) {
		int input;
		do {
			input = getInt(scnr, prompt);
			if (input <= 0) {
				System.out.println("You must enter a positive number.");
			}
		} while (input <= 0);
		return input;
	}
	
	public static double getDouble (Scanner scnr, String prompt) {
		
		System.out.print(prompt);
		while (!scnr.hasNextDouble()) {
		scnr.nextLine();
		System.out.println("That is not a valid integer. Please try again.");
		System.out.print(prompt);
		}
	
		double input = scnr.nextDouble();
		scnr.nextLine(); 
		return input;
	}
	public static int getOneThroughTen(Scanner scnr, String prompt) {
		int input;
		do {
			input = getInt(scnr, prompt);
			if (input <= 0 || input > 10) {
				System.out.println("Sorry, that is not a student number in our records.  You must enter a whole number between 1-10");
				System.out.println();
			}
		} while (input <= 0 || input > 10);
		return input - 1;
	}

	public static boolean getYesNo (Scanner scnr, String prompt) {
		String response;
		boolean isValid;
		boolean yesNo = true;
		
		System.out.println(prompt);
		do {
			response = scnr.nextLine();
			isValid = response.equalsIgnoreCase("Yes") || response.equalsIgnoreCase("No");
			if (!isValid) {
				System.out.println("Sorry, you can only choose 'Yes' or 'No'.  Please try again. ");
			}
			} while (!isValid);
		if(response.equalsIgnoreCase("yes")) {  yesNo = true;
		} if (response.equalsIgnoreCase("no")) { yesNo = false;
		}return yesNo;
		}
	public static boolean playAgain (Scanner scnr, String prompt) {
		String response;
		boolean isValid;
		boolean yesNo = true;
		
		System.out.println(prompt);
		do {
			response = scnr.nextLine();
			isValid = response.equalsIgnoreCase("Yes") || response.equalsIgnoreCase("No");
			if (!isValid) {
				System.out.println("Sorry, you can only choose 'Yes' or 'No'.  Please try again. ");
			}
			} while (!isValid);
		if(response.equalsIgnoreCase("no")) {  yesNo = false;
		}return yesNo;
		}
	
	public static String getFoodorCity (Scanner scnr, String prompt){
		String response;
		boolean isValid;
		System.out.println(prompt);
		do {
			response = scnr.nextLine();
			isValid = response.equalsIgnoreCase("hometown") || response.equalsIgnoreCase("Favorite Food");
			if (!isValid) {
				System.out.println("Please try again and only choose 'Hometown' or 'Favorite Food' ");
			}
			}while (!isValid);
			return response;
	}
			}

			
		
	
		


