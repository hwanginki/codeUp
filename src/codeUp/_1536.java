package codeUp;

import java.util.Scanner;

public class _1536 {
	
	static void f(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		int result = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				result = arr[i];
				break;
			}
		}
		System.out.print(result);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		
		f(arr);
		sc.close();
	
	}

}
