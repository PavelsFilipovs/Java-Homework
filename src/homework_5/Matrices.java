package homework_5;

import java.util.Random;
import java.util.Scanner;

public class Matrices {

	final int minArrRange = 3, maxArrRange = 6, minNummberRange = 1, maxNummberRange = 100;
	
	public void task() {
		Scanner scanner = new Scanner(System.in);
		
		int firstDimension = randomGeneration(minArrRange, maxArrRange);
		int secondDimension = randomGeneration(minArrRange, maxArrRange);
		
		int[][] myArray = new int[secondDimension][firstDimension];

		System.out.println("Pieprasa no lietot�ja veikt izv�li:\n\tA. Aizpild�t mas�va elementa v�rt�bas manu�li\n"
				+ "\tB. Aizpild�t mas�va elementa v�rt�bas nejau�i (ar skait�iem no 1 l�dz 100)");

		String answerString = scanner.next();
		while (!answerString.equals("A") && !answerString.equals("B")) {
			System.out.print("Ivad�t vajaga 'A' vai 'B': ");
			answerString = scanner.next();
		}
		
		
		for (int i = 0; i < secondDimension; i++) {
			for (int j = 0; j < firstDimension; j++) {
				if (answerString.equals("A")) {
					myArray[i][j] = scanner.nextInt();
				} else if (answerString.equals("B")) {
					myArray[i][j] = randomGeneration(minNummberRange, maxNummberRange);
				} 
			}
		}
		
		
		
		for (int i = 0; i < secondDimension; i++) {
			for (int j = 0; j < firstDimension; j++) {
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < secondDimension; i++) {
			for (int j = 0; j < firstDimension; j++) {
				if (i == j) {
					myArray[i][j] = 1;
					System.out.print(myArray[i][j] + "\t");
				} else {
					myArray[i][j] = 0;
					System.out.print(myArray[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
		
	}
	
	public int randomGeneration(int min, int max) {
		return (int)(Math.random()*(max-min))+min;
	}

}
