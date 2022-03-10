package codeUp;

import java.io.*;

public class _1580 {

	public static void circle(int r) {
		System.out.printf("%.2f", 3.14 * r * r);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		br.close();
		
		circle(n);
		
	}
}
