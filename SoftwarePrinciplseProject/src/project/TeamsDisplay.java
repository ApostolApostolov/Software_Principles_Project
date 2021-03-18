package project;

public class TeamsDisplay {
		static String teamName;
		int budget;
		int usedBudget;
		String person;
		String amount;
		
	
		TeamsDisplay(){
			
		}
		
		TeamsDisplay(String teamName,int  budget,int usedBudget, String person, String amount){
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
		public String getPerson() {
			return person;
		}
		public void setPerson(String person) {
			this.person = person;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		
		
}
