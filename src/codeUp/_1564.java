package codeUp;

import java.io.*;
import java.util.*;

public class _1564 {
	
	public static int f(int x, int y) {
		int[] arr = new int[1000];
		int max;
		
		for (int i = 1; i <= x; i++) {
			if (x % i == 0 && y % i == 0) {
				arr[i] = i;
			} 
		}
		
		Arrays.sort(arr);
		max = arr[0];
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}
		return max;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		System.out.print(f(x, y));

		br.close();

	}
}
