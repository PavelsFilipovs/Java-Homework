package homework_5;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		myLoop();
		
	}
	
	public static void myLoop() {
		String choiceFromTask;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seit ir divi uzdevumi: \n\tMatrices uzpied 1\n\tSortArrays2d uzpied 2");
		choiceFromTask = scanner.next();
		
		if (choiceFromTask.equals("1")) {
			Matrices matrices = new Matrices();
			matrices.task();
		} if (choiceFromTask.equals("2")){
			SortArray2D array2d = new SortArray2D();
			array2d.task();
		} else {
			myLoop();
		}
		
		scanner.close();
	}
}


