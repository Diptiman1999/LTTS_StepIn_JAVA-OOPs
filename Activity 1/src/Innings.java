
public class Innings {
	
	private String teamname;
	private String inningsname;
	private int runs;
	
	
	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getInningsname() {
		return inningsname;
	}

	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public void displayInningsDetails()
	{
		System.out.println("Name :"+getTeamname());
		System.out.println("Scored :"+getInningsname());
		System.out.println("Need "+(getRuns()+1) + " runs to win.");
		System.out.println("Match Ended");
	}
	
}
