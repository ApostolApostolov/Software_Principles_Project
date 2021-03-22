package project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
	static String firstName = "";
	static String lastName = "";
	static String teamId = "";
	static char userInput;
	static int breaker = 0;
	static TeamsDisplay userTeam = new TeamsDisplay();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		
	

		
		
		LoginPage loginPage = new LoginPage();
		
		
		fileReader.budgetData();
		System.out.println("Options");
		System.out.println("1 - add expenses");
		System.out.println("2 - log out");
		System.out.println("3 - ?????");

		while(breaker == 0) {
			userInput = sc.next().charAt(0);
			

			switch(userInput) {
			case '1':
				System.out.println("add expenses");
				breaker = 1;
				addExpensesMenu();

				break;
			case '2':
				System.out.println("Log out");
				breaker = 1;
				break;
				
			default:
				System.out.println("Please enter valid input");
			}
			
		}
		
		
		
		
		
		
	}
	
	public static void addExpensesMenu() {
		/*
		 * 
		 * 	//ako budget == 0 exit
		 * ako e pogolqm prdulji
		 * ako vuvedenata syma e po -golqma ot budget shans za exit ili samo tova koeto mooje da plate
		 * i plashtane na cqloto
		 * priema samo chishla
		 * ako ne ne chislo greshka i popoulvane ot novo
		 * 
		 * */
		
		fileReader.displayUserTeam();
		fileReader.displayUserTeamMembers();
		// public static void + while loop
		System.out.println("How much would you like to add ?");
		int amount = sc.nextInt();
		int budget = fileReader.budget;
		int usedBudget = fileReader.usedBudget;
		int remBudget = budget - usedBudget;
		
		if (remBudget <=0) {
			System.out.println("Your budget is 0");
			return;
		}
		else if (remBudget >0 && remBudget < amount) {
			System.out.println("Offer to compensate only the avaliable part");
		}
		else if (remBudget >= amount) {
			System.out.println("just compensate the guy");
		}
		else {
			System.out.println("Please enter a valid number");
		}
		
		
		
		
		
		//confimation
		//how to add date
		//firstName = LoginPage.firstName;
		//System.out.println(); // first name, last name, amount 
		
		
		

		

		
	}
	
}
