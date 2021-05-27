package ProblemSet1;

import java.util.Scanner;

public class secureUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secureUrl obj = new secureUrl();
		obj.secure();
	}
	
	void secure() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String res = scan.next();
		System.out.println("Enter the start string: ");
		String endRes = scan.next();
//		split string into array from a particular point
		String words[] = res.split(":");
//		storing the particular word in another string variable
		String word = words[0];
		if(word.equals("http") || word.equals("https")) {
			System.out.println(res+" starts with https");
		}
		else {
			System.out.println(res+" doesnot starts with https");
		}
		scan.close();
	}
}
