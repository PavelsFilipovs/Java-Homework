package homework_5;

import java.util.Scanner;

public class SortArray2D {
	final int minArrayAutoValue = 4, maxArrayAutoValue = 15, minArrayManualValue = 5, maxArrayManualValue = 15;
	final int minRandomNummber = 100, maxRandomNummber = 999;
	
	public void task() { 
		int secondDimansion, userIn_FirstDimension;
		Scanner scanner = new Scanner(System.in);
		//int[][] nummberArray;
		
		
		do {
            System.out.printf("Ievadît 2D masîva 1.dimensijas (no %s lîdz %s) izmçru: ", minArrayManualValue, maxArrayManualValue);
            while (!scanner.hasNextInt()) {
                System.out.printf("\"%s\" nav skaitlis no %s lidz %s", scanner.next(), minArrayManualValue, maxArrayManualValue);
            }
            userIn_FirstDimension = scanner.nextInt();       
        } while ((userIn_FirstDimension < minArrayManualValue) || (userIn_FirstDimension > maxArrayManualValue));
		
		secondDimansion = (int)(Math.random()*(maxArrayAutoValue-minArrayAutoValue))+minArrayAutoValue;
		
		int[][] nummberArray = new int[secondDimansion][userIn_FirstDimension];
		
		for (int i = 0; i < secondDimansion; i++) {
			for (int j = 0; j < userIn_FirstDimension; j++) {
				nummberArray[i][j] = 
						(int)(Math.random()*(maxRandomNummber-minRandomNummber))+minRandomNummber;
			}
		}
		
		for (int i = 0; i < secondDimansion; i++) {
			for (int j = 0; j < userIn_FirstDimension; j++) {
				System.out.print(nummberArray[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < secondDimansion; i++) {
			for (int j = 0; j < userIn_FirstDimension; j++) {
				for (int j2 = 0; j2 < userIn_FirstDimension - 1; j2++) {
					int swipeNummber;
					if (nummberArray[i][j2] > nummberArray[i][j2 + 1]) {
						swipeNummber = nummberArray[i][j2];
						nummberArray[i][j2] = nummberArray[i][j2 + 1]; 
						nummberArray[i][j2 + 1] = swipeNummber;
					}
				}
			}
		}
		
		int[] tempSwipe = nummberArray[0];
		nummberArray[0] = nummberArray[nummberArray.length - 1];
		nummberArray[nummberArray.length - 1] = tempSwipe;
		
		for (int i = 0; i < secondDimansion; i++) {
			for (int j = 0; j < userIn_FirstDimension; j++) {
				System.out.print(nummberArray[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
}
