package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class empSearchApp {

	public static void main(String[] args) {

		Set<Emp> empSet = new HashSet<>();
		empSet.add(new Emp(100, "Rajesh", "Hyderabad", 45000));
		empSet.add(new Emp(101, "Scott", "London", 55000));
		empSet.add(new Emp(102, "Ashish", "Bangalore", 65000));
		empSet.add(new Emp(103, "Shantanu", "Hyderabad", 35000));
		empSet.add(new Emp(104, "Rupa", "Hyderabad", 35000));
		empSet.add(new Emp(105, "Chethan", "Delhi", 45000));
		empSet.add(new Emp(106, "Kirthi", "Bangalore", 75000));
		empSet.add(new Emp(107, "Kamal", "Bangalore", 45000));
		empSet.add(new Emp(108, "Manoj", "Hyderabad", 75000));
		empSet.add(new Emp(109, "Ramesh", "Hyderabad", 65000));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'quit' to exit...");
		while (true) {
			boolean found=false;
			System.out.println("Enter empId to search : ");
			int empId = sc.nextInt();
			for (Emp e : empSet) {
				if (e.getEmpId() == empId) {
					System.out.println(e.getDetails());
					found = true;
				}
			}
			if (!found) {
				System.out.println("Employee Not found...");
			}
			
			
		}

	}

}