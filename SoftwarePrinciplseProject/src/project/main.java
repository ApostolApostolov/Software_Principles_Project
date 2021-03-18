package project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
	static String firstName = "";
	static String lastName = "";
	static String teamId = "";
	private static Scanner x;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
	
		Scanner sc = new Scanner(System.in);
		
		LoginPage loginPage = new LoginPage();
		
		
		firstName = LoginPage.loggedUser.getFirstName();
		lastName = LoginPage.loggedUser.getLastName();
		teamId = LoginPage.loggedUser.getUserTeamId();
		fileReader.budgetData();

		
		
		
		
		
		
	}
	/*	public static void teamsInfo() {
			private static Scanner fileScanner;
			try {
				fileScanner = new Scanner(new File(filepath));
				fileScanner.useDelimiter("[,\n]");
				while(fileScanner.hasNext() && !found) {
					userName_database = fileScanner.next();
					userPassword_database = fileScanner.next();
					firstName = x.next();
					lastName = x.next();
					teamId = x.next();
					//please stop read until reach the symbol ":"
					
					
					
					if (userName_database.trim().equals(username.trim()) && userPassword_database.trim().equals(password.trim())) {

						loggedUser.setUsername(userName_database);
						loggedUser.setPassword(userPassword_database);
						loggedUser.setFirstName(firstName);
						loggedUser.setLastName(lastName);
						loggedUser.setUserTeamId(teamId);
						
						found = true;
					}
							
				}
				x.close();
				if (found == true) {
					
					break;
					
				}
				else if (found == false ) {
					System.out.println("Username or password is incorrect");
				}
			}
			catch(Exception e) {
				System.out.println("error");
				e.printStackTrace();
			}
			}while(true);
			
		}
*/
}
