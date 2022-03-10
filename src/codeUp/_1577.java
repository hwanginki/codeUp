package codeUp;

import java.io.*;

public class _1577 {

	public static void myabs(int n) {
		System.out.print(Math.abs(n));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		myabs(x);
	}
}
