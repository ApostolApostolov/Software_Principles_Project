package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.PushbackReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;


public class fileReader {
	static boolean found = false;
	static String path = "budgetData.txt";
	static String userTeamId = LoginPage.loggedUser.getUserTeamId();
	static String teamName;
	static int budget;
	static int usedBudget;
	static String id;
	
	

	
	
	public static void budgetData() throws IOException {
		
		FileInputStream inputStream = null;
		Scanner sc = null;
		try {
			
			inputStream = new FileInputStream(new File (path));
		
		    sc = new Scanner(inputStream, "UTF-8");
		    sc.useDelimiter("[,\n]");
		    String line = "";
		    while (sc.hasNext()) {
		        
		        
		        if (line.equals("teamId")) {
		        	
		        	
		        	id = sc.next().trim(); // symbol inforont of the name easier finding
		        	if (id.equals(userTeamId)) {
		        		//only user's team information
		        		
		        		TeamsDisplay team = new TeamsDisplay();
		        		team.setTeamName(sc.next().trim());
		        		team.setBudget(Integer.parseInt(sc.next().trim()));
		        		team.setUsedBudget(Integer.parseInt(sc.next().trim()));
		        		teamName = team.getTeamName();
		        		budget = team.getBudget();
		        		usedBudget = team.getUsedBudget();
		        		displayUserTeam(teamName, budget, usedBudget);
		        		
		        	}
		        	
		        	else {
		        		teamName = sc.next().trim();
			        	budget = Integer.parseInt(sc.next().trim());
			        	usedBudget = Integer.parseInt(sc.next().trim());
			        	
			        	
			        	displayBudgetData(teamName,budget,usedBudget);

				       
		        	}
		        	 do {
		        			
				        	if (sc.hasNext()){
				        		String temp = sc.next();
				        		if(temp.equals("teamId")) {
				        			break;
				        		}
				        		else {
				        			String name = temp;
						        	String amount = sc.next().trim();
						        	displayBudgetDataTeamMember(name,amount);
						        	
				        		}
				        	}
				        	else {
				        		break;
				        	}
				        	
				        }while(true);
		        	
		        }
		        else {
		        	line = sc.next();
		        }
		        
		    }
		    // note that Scanner suppresses exceptions
		    if (sc.ioException() != null) {
		        throw sc.ioException();
		    }
		    
		   
		  
		} finally {
		    if (inputStream != null) {
		        inputStream.close();
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
	}

	
	
	public static void displayBudgetData(String displayTeamName,int displayBudget, int displayUsedBudget) {
		System.out.println("");
		System.out.println("Team: " + displayTeamName);
		System.out.println("Budget: " + displayBudget);
		System.out.println("Used budget: " + displayUsedBudget);
	}
	public static void displayBudgetDataTeamMember(String name , String amount) {
		System.out.println(name + " " + amount);
	}
	
	public static void displayUserTeam(String userTeam,int userTeamBudget, int userUsedTeamBudget) {
		System.out.println("");
		System.out.println("Your Team :" + userTeam);
		System.out.println("Budget: " + userTeamBudget);
		System.out.println("UsedBuget: " + userUsedTeamBudget);
	}
}
