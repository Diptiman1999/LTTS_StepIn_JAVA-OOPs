
public class Company {
	private String name;
	private String employees;
	private String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmployees() {
		return employees.split(",");
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	
	public void printDetails(){
		boolean flag = false;
		String[] elist = getEmployees();
		for(int i = 0; i < elist.length; i++){
			if (getTeamlead().equals(elist[i])){
				flag = true;
				break;
			}
		}
		if (flag){
			System.out.println("Name: "+getName());
			System.out.println("Employees: "+String.join(",",getEmployees()));
			System.out.println("Lead: "+getTeamlead());
		} else {
			System.out.println("Invalid Input");
		}
	}
	
}
