package codeUp;

import java.util.*;

public class _1551 {

	static int f(int[] arr, int x) {
		
		int answer = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i + 1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(f(arr, sc.nextInt()));
		sc.close();
	}

}
