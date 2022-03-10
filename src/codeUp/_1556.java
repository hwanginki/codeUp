package codeUp;

import java.io.*;

public class _1556 {
	
	public static int f(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * f(n - 1);
		}
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = Integer.parseInt(br.readLine());
		System.out.println(f(i));
		
		br.close();
	}
}
