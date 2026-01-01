package BasicPrograms;

import java.util.Scanner;

public class ReadAndPrintInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Integer: ");
		int num = sc.nextInt();
		
		System.out.println("Entered number is: "+ num);
	}
}
