package week1;

import java.util.Scanner;

public class CGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calculating Percentage of students of CBSE with 5 subjects");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks of subject 1");
		int s1 = scanner.nextInt();
		System.out.println("Enter marks of subject 2");
		int s2 = scanner.nextInt();
		System.out.println("Enter marks of subject 3");
		int s3 = scanner.nextInt();
		System.out.println("Enter marks of subject 4");
		int s4 = scanner.nextInt();
		System.out.println("Enter marks of subject 5");
		int s5 = scanner.nextInt();
		int sum = s1+s2+s3+s4+s5;
		double cgpa = (sum/300);
		System.out.println("Percentage of 5 subjects is : "+cgpa);
		
	}

}
