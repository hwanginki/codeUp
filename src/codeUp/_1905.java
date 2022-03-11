package codeUp;

import java.io.*;

public class _1905 {
	static int recursive(int x) {
		if (x == 0) {
			return 0;
		}
		int sum = 0;
		sum = recursive(x - 1) + x;
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(recursive(x));
		br.close();
	}
}
