package codeUp;

import java.util.Scanner;

// 버블 정렬 알고리즘
public class _1441 {
	
	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}
		
		bubbleSort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
