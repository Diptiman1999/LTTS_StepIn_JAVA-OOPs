import java.util.*;
public class CustomerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		
		System.out.println("Enter the details:");
		String s = sc.nextLine();
		String str[] = s.split(",");
		
		c.setName(str[0]);
		c.setAddress(str[1]);
		c.setMobile(str[2]);
		
		System.out.println("Name: "+c.getName());
		System.out.println("Addres: "+c.getAddress());
		System.out.println("Mobile: "+c.getMobile());
		
	}

}
