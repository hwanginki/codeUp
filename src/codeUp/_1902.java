package codeUp;

import java.io.*;

public class _1902 {
	static void recursive(int n) {
		if (n == 0) {
			return;
		} else {
			System.out.println(n);
			DFS(n - 1);
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
