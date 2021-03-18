package project;
import java.util.Scanner;

import java.io.File;

import java.util.Scanner;


/* search algotritum based on looking for the first letter 
 * that whay it will skip(it will be faster) and probably save time + not that much memory will be used?
 * 
 * 
 * 
 * 
 * Try it it may be fun :D
 * */
public class LoginPage {
	static Scanner sc = new Scanner(System.in);
	private static Scanner x;
	static String username = "";
	static String password = "";
	static String filepath = "accDetails.txt";
	static boolean found = false;
	static String userName_database = "";
	static String userPassword_database = "";
	static String teamId = "";
	static String firstName = "";
	static String lastName = "";
	static LoggedUser loggedUser = new LoggedUser(username ,password,firstName,lastName,teamId);
	
	
	LoginPage(){
		verifyLogin();
		
	}
	

	static   void  verifyLogin(){
		
		do {
		System.out.println("username: ");
		username = sc.next();
		System.out.println("password: ");
		password = sc.next();


		
		
		try {
			x = new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");
			while(x.hasNext() && !found) {
				userName_database = x.next();
				userPassword_database = x.next();
				firstName = x.next();
				lastName = x.next();
				teamId = x.next().trim();
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

	public static void forgotenPassword() {
		
	}


	
	
	
	}

	

