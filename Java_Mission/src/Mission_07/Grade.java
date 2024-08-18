package Mission_07;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 0 || arr[i] > 100) {
				i--;
			}
			
		}
		
		selectionSort(arr);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }
	}
	
	static void selectionSort(int[] arr) {
		int L = arr.length;
		for (int i = 0; i < L - 1; i++) {
			int min = i;
			for (int j = i+1; j < L; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
