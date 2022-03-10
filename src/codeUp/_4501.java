package codeUp;

import java.util.*;

public class _4501 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer[] arr = new Integer[7];
		
		for (int i = 0; i < arr.length; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(arr[0] + "\n" + arr[1]);

	}

}
