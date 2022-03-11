package codeUp;

import java.io.*;

public class _1912 {
	static int recursive(int x) {
		if (x == 1) return 1; else return x * recursive(x - 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(recursive(x));
		br.close();
	}
}