import java.util.Scanner;


public class EmployeeMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee1 e = new Employee1();
		
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		e.setName(name);
		
		System.out.println("Enter Address:");
		String address = sc.nextLine();
		e.setAddress(address);

		System.out.println("Enter the Mobile:");
		String mobile = sc.nextLine();
		e.setMobile(mobile);
		int ch;
		do
		{
			System.out.println("Menu");
			System.out.println("1 Update Employee name");
			System.out.println("2 Update Employee Address");
			System.out.println("3 Update Employee mobile");
			System.out.println("4 All information correct/Exit");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Current Name is: "+e.getName());
					System.out.println("Enter the Name: ");
					e.setName(sc.next());
				break;
				case 2:
					System.out.println("Current Address is: "+e.getAddress());
					System.out.println("Enter the address: ");
					e.setAddress(sc.next());
				break;
				case 3:
					System.out.println("Current Mobile : "+e.getAddress());
					System.out.println("Enter the mobile: ");
					e.setMobile(sc.next());
				break;
				case 4:
					System.out.println("Name: "+e.getName());
					System.out.println("Address: "+e.getAddress());
					System.out.println("Mobile: "+e.getMobile());
				break;		
			}
		}while(ch!=4);
		//Printing the output
		
	}

}
