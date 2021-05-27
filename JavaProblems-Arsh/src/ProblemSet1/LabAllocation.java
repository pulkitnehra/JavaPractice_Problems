package ProblemSet1;

import java.util.Scanner;

public class LabAllocation {
	public static void main(String[] args) {
		LabAllocation lb1 = new LabAllocation();
		lb1.minimalSeatingCapacity();
		
	}
	
	
	void minimalSeatingCapacity() {
//		taking input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x= scan.nextInt();
		System.out.println("Enter y: ");
		int y = scan.nextInt();
		System.out.println("Enter z: ");
		int z = scan.nextInt();
		scan.close();
		if(x==y || x==z || y==x || y==z || z==x || z==y ) {
			System.out.println("Numbers should be distinct");
		}
		else {
		String res = x < y && x < z ? "L1 has the minimal seating capacity  " :  
			y < x && y < z ? "L2 has the minimal seating capacity": 
			z < x && z < x ? "L3 has the minimal seating capacity":"Try Again Later!!";
		
		System.out.println(res);
		}
	}

}

