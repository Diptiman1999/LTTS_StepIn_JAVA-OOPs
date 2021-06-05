import java.util.*;
public class CompanyMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Company c =new Company();
		
		System.out.println("Enter the company name: ");
		c.setName(sc.nextLine());
		System.out.println("Enter the employess: ");
		c.setEmployees(sc.nextLine());
		System.out.println("Enter the TeamLead: ");
		c.setTeamlead(sc.nextLine());
		
		c.printDetails();

	}

}

