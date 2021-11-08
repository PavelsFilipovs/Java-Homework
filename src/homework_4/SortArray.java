package homework_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int arrLenght, min = 10, max = 99; 
		Scanner scan = new Scanner(System.in);
		int[] arr;
		
		System.out.print("Ievadiet masîva lielumu no 20 lîdz 40: ");
		arrLenght = scan.nextInt();
		
		arr = new int[arrLenght];
		
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1)+min);
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int takeNum;
					takeNum = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = takeNum;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
