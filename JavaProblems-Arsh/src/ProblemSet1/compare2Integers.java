package ProblemSet1;

import java.util.Scanner;

public class compare2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare2Integers obj = new compare2Integers();
		obj.comapreIntegers();
	}
	
	void comapreIntegers() {
//		taking input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:  \n ");
		int x= scan.nextInt();
		System.out.println("Enter the second number:  \n ");
		int y = scan.nextInt();
		scan.close();
		String result = x < y ? x+" is less than "+y : y < x ? y+" is less than "+x : y == x ? y+" is equal to "+x:" ";  
		System.out.println(result);
	}

}
