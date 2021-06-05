import java.util.*;
public class InningsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Innings ing = new Innings();
		System.out.println("Enter the name:");
		String teamname = sc.nextLine();
		
		System.out.println("Enter session:");
		String inningname = sc.nextLine();
		
		System.out.println("Enter runs:");
		int runs = sc.nextInt();
		
		ing.setTeamname(teamname);
		ing.setInningsname(inningname);
		ing.setRuns(runs);
		ing.displayInningsDetails();
	}

}
