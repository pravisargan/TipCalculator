/*
  Write Java Program that will calculate tips based on the number of people, price, and service quality.
  The program will take user input for check amount, number of people to split the check, and number of 
  stars that represent the service quality. 
  
  Then user should select service quality that will correspond to tip percent.
 
   1 star: Poor 5%
   2 starts: Fair 10%
   3 stars: Good 15%
   4 stars: Great 20%
   5 stars: Excellent 25% 
   
   The program should display the following information based on the user input:
   	
   	Total to pay:
   	Total tip:
   	Total per person:
   	Tip per person:
   
 
   You can download the app at:
   https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
 
  Example:
  
	Input: 
		Number of people: 2
		Check amount: 100.00
		Service Quality: 5 stars  (excellent, 25%)
	Output:
		Total to pay: $125.00
		Total tip: $25.00
		Total per person: $62.50
		Tip per person: $12.50 
		
	
		
	Invalid input: 
		number of people: 0 or more than 10
		check amount: less than or equal to 0
		stars: less than or equal to 0 or greater than 5
	
	If the input is invalid, you should return 0 for all items.

 */
package tipcalculator;

import java.text.DecimalFormat;

public class TipCalculator {
	
	
	
	public static void main(String[] args) {
		
		/**
		 * You can modify the main method.
		 */
		TipCalculator tip = new TipCalculator();
		Bill bill = new Bill();
	
		
		int numberOfPeople = 1;
		double checkAmount = 60;
		int stars = 3;
		
		
		bill = tip.calculate(numberOfPeople,checkAmount, stars);
		
		
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println("Number of people:" + f.format(bill.numberOfPeople));
		System.out.println("Check Amount:$" + f.format(bill.amount));
		System.out.println("Service Quality:" + bill.stars + " stars");
		System.out.println("Total Amount:$" + f.format(bill.totalAmount));
		System.out.println("Amount per person:$" + f.format(bill.amountPerPerson));
		System.out.println("Tip per person:$" + f.format(bill.tipPerPerson));
	
	}
	
	
	/**
	 * 
	 * @param numberOfPeople     number of people who split the check 
	 * @param checkAmount		 amount of check
	 * @param stars				 quality of service
	 * @return  Bill info
	 */
	
	public Bill calculate(int numberOfPeople, double checkAmount, int stars){
		
		Bill b = new Bill();
		
		// TO DO 
		// Implement the tip calculator code here
		
		
		// Your code goes here
		

		
		// Update the -1 below with the correct variable name 
		
		b.amount = -1;
		b.amountPerPerson = -1;
		b.numberOfPeople = -1;
		b.stars = -1; 
		b.tipPerPerson = -1;
		b.totalAmount = -1;
		b.totalTip = -1;
		return b;
	}

}
