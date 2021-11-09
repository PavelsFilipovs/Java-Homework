package homework_5;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seit ir divi uzdevumi: \n\tMatrices uzpied 1\n\tSortArrays2d uzpied 2");
		int classTake = scanner.nextInt();
		
		if (classTake == 1) {
			Matrices matrices = new Matrices();
			matrices.task();
		}
		else System.out.println("ari lidz galam nav"); // if pievienot elsa vietâ
		
		scanner.close();
		
		
	}
}


