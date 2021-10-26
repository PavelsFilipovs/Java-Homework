package homework_3;

import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ievadît kâdu vârdu un uzvârdu vienâ rindâ ar atstarpi: ");
		String name = scan.next();
		String surename = scan.next();
		
		System.out.println("'" + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "'");
		System.out.println("'" + surename.toUpperCase() + "'");

	}
	

}

