package codeUp;

import java.util.Scanner;

// 선택 정렬 알고리즘
public class _1442 {

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
				int idx = i;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] < arr[idx])
						idx = j;
				}
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
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
