package codeUp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//1709 데이터 정렬(내림차순)
public class _1709 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] descending = new Integer[n];
		
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			descending[i] = input;
		}
		
		Arrays.sort(descending, Collections.reverseOrder());
		
		for (int i : descending) {
			System.out.print(i + " ");
		}
	}

}