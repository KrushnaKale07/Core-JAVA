
public class SoccarGame extends GenericSports {
	/*Complete the code in your editor by writing an overridden getNumberOfTeamMembers method 
	that prints the same statement as the superclass' getNumberOfTeamMembers method,
	except that it replaces n with 11  (the number of players on a Soccer team).
	
	Generic Sports
	Each team has n players in Generic Sports
	Soccer Class
	Each team has 11 players in Soccer Class*/
	
	public void getNumberOfTeamMembers(){
		System.out.println("Each team has 11 players in Soccer Class");
	}
	
	public static void main(String[] args) {
		
		GenericSports genericSports = new GenericSports();
		genericSports.getNumberOfTeamMembers();
		
		SoccarGame soccarGame = new SoccarGame();
		soccarGame.getNumberOfTeamMembers();
	}

}
