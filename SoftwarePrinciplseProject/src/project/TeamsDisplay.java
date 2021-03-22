package project;

import java.util.ArrayList;

public class TeamsDisplay {
		static String teamName;
		int budget;
		int usedBudget;
		ArrayList<String> person = new ArrayList<String>();
		ArrayList<Integer> amount = new ArrayList<Integer>();
		
	
		TeamsDisplay(){
			
		}
		
		TeamsDisplay(String teamName,int  budget,int usedBudget, ArrayList<String> person, ArrayList<Integer> amount){
			this.teamName = teamName;
			this.budget = budget;
			this.usedBudget = usedBudget;
			this.person = person;
			this.amount = amount;
					
					
		}
		public static String getTeamName() {
			return teamName;
		}
		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}
		public int getBudget() {
			return budget;
		}
		public void setBudget(int usedBudget2) {
			this.budget = usedBudget2;
		}
		public int getUsedBudget() {
			return usedBudget;
		}
		public void setUsedBudget(int usedBudget) {
			this.usedBudget = usedBudget;
		}
		public ArrayList<String> getPerson() {
			return person;
		}
		public void setPerson(ArrayList<String> person) {
			this.person = person;
		}
		public ArrayList<Integer> getAmount() {
			return amount;
		}
		public void setAmount(ArrayList<Integer> amount) {
			this.amount = amount;
		}
		
		public static void displayName(String[] person) {
			
			for (int i =0;i<person.length;i++) {
				
			}
				
		}
		
}
