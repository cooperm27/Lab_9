import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class CoderMikesGrocery {

	public static void main(String[] args) {
	boolean playAgain = true;
	Scanner scnr = new Scanner(System.in);
	ArrayList<Double> price = new ArrayList<>();
	ArrayList<String> menuChoices = new ArrayList<>();
	HashMap<String, Double> menu = new HashMap<>();
	menu.put("apple", 0.99);
	menu.put("banana", 0.59);
	menu.put("cauliflower", 1.59);
	menu.put("dragonfruit", 2.19);
	menu.put("elderberry", 1.79);
	menu.put("figs", 2.09);
	menu.put("grapefruit", 1.99);
	menu.put("honeydew", 3.49);
	
	System.out.println("Welcome to Coder Mike's Market!");
	System.out.println();
	System.out.printf("%-20s%-20s\n", "Item" , "Price");
	System.out.printf("===============================");
	System.out.println();
	
	do {
			for (Map.Entry<String, Double> entry : menu.entrySet()) {
				System.out.printf("%-20s%-20s\n", entry.getKey(),entry.getValue());
			}
			System.out.println();
			System.out.println("What item would you like to order?");
			String choiceEntry = scnr.nextLine();
			String choice = choiceEntry.toLowerCase();
			if (menu.containsKey(choice)) {
			System.out.println("Adding " + choice + " to cart at " + menu.get(choice));
			menuChoices.add(choice);
			price.add(menu.get(choice));
	} if (!menu.containsKey(choice)) {
		System.out.println("Sorry, we dont have those");
	} playAgain = Validator.playAgain(scnr, "Would you like to order anything else?");
	}while (playAgain);
	scnr.close();
	System.out.println("Thanks for your order!");
	System.out.println("Here's what you got");
	System.out.println();
	
	for (int i = 0; i < menuChoices.size(); i++) {
	System.out.printf("%-11s%-1s%-11s\n", menuChoices.get(i),"$",price.get(i));
	}
	System.out.println();
	System.out.println("Your total comes to $" + getSum(price));
	System.out.println("The average price per item was $" + findAverage(price));
	System.out.println("The highest priced item you bought was $" + findMax(price));
	System.out.println("The lowest priced item you bought was $" + findMin(price));
	}
	
	
	public static double findAverage(ArrayList<Double> price) {
		double average = 0;
		double sum = 0;
			for (double num : price) {
				sum += num;			
			}
			average = (sum/price.size());
			return average;
			
		}
	public static double findMax(ArrayList<Double> price) {
		double max = price.get(0);
		for (int i = 0; i < price.size(); i++) {
			if (max < price.get(i)) { 
			max = price.get(i);
			}
		}
		return max;
	}
	
	public static double findMin(ArrayList<Double> price) {
		double min = price.get(0);
		for (int i = 0; i < price.size(); i++) {
			if (min > price.get(i)) { 
			min = price.get(i);
			}
		}
		return min;
	}
	public static double getSum(ArrayList<Double> price) {
		double sum = 0;
			for (double num : price) {
				sum += num;			
			}
			return sum;
			
		}
	
}
		

