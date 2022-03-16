package codeUp;

import java.io.*;

public class _1928 {

	static void recursive(int n) {
		System.out.println(n);
		if (n == 1) {
			return;
		}
		if (n % 2 == 0) {
			recursive(n / 2);
		} else {
			recursive((3 * n) + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		recursive(x);
		br.close();
	}
}
