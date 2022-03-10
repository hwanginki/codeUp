package codeUp;

import java.io.*;

public class _1557 {
	
	static int count = 0;
	
	public static int f(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				continue;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = Integer.parseInt(br.readLine());
		System.out.println(f(i));
		
		br.close();
	}
}
