package codeUp;

import java.io.*;

public class _1901 {
	static void recursive(int n) {
		if (n == 0) {
			return;
		} else {
			DFS(n - 1);
			System.out.println(n);
		}
	}
	
	public static void DFS(int n) {
		recursive(n);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		recursive(n);
		
		br.close();
	}
}
