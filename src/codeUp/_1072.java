package codeUp;

import java.util.*;

public class _1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] save = new int[n];
		
		for (int i = 0; i < n; i++) {
			int in = sc.nextInt();
			save[i] = in;
			System.out.println(save[i]);
		}
		sc.close();
	}

}
