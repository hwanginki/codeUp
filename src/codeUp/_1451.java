package codeUp;

import java.util.*;

// 1451문제 데이터 정렬(small)
public class _1451 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] small = new int[n];
		
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			small[i] = input;
		}
		
		Arrays.sort(small);
		
		for (int i : small) {
			System.out.println(i);
		}
	}

}
