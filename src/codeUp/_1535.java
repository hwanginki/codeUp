package codeUp;

import java.util.Scanner;

public class _1535 {
	
	static void f(int[] arr) {
		
		int max = 0;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				result = i + 1;;
				break;
			}
		}
		
		System.out.println(result);
		
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
