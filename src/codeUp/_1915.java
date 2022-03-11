package codeUp;

import java.io.*;

public class _1915 {
	static int fibonacci(int x) {
		if (x == 1 || x == 2) {
			return 1;
		} else {
			return fibonacci(x-2) + fibonacci(x-1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(x));
		br.close();
	}
}