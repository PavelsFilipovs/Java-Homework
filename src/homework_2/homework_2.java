package homework_2;

import java.util.Scanner;

public class homework_2 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ievadiet ciparu pa X asi: ");
		int x = in.nextInt();

		System.out.print("Ievadiet ciparu pa Y asi: ");
		int y = in.nextInt();
		
		if((x > -2 && x < 3) && (y > -4 && y < 1)) {
			System.out.println(" X,Y koordin�tas ir fig�ras iek�ien�");
		} else if((x >= -2 && x <= 3) && (y >= -4 && y <= 1)) {
			System.out.println("X,Y koordin�tas ir fig�rai uz l�nijas");
		} else {
			System.out.println("X,Y koordin�tas ir fig�ras �rpus�");
		}
		
		
	}

}
