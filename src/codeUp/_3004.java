package codeUp;

import java.util.*;

public class _3004 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] answer = new int[n];
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[i] = x;
			map.put(i, x);
		}
		
		int cnt = 0;
		for (int j = 0; j < n; j++) {
			if (map.get(i) > arr[j])
				cnt++;
		}
		answer[i] = cnt;
		
		for (int i : answer) {
			System.out.print(i + " ");
		}

	}
}
