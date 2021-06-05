import java.util.*;


public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		e.setName(name);
		
		System.out.println("Enter Address:");
		String address = sc.nextLine();
		e.setAddress(address);

		System.out.println("Enter the Mobile:");
		String mobile = sc.nextLine();
		e.setMobile(mobile);
		
		//Printing the output
		System.out.println("Name: "+e.getName());
		System.out.println("Address: "+e.getAddress());
		System.out.println("Mobile: "+e.getMobile());
	}

}
