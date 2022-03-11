package codeUp;

import java.io.*;

public class _1408 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char[] ascii = str.toCharArray();
		
		for (int i = 0; i < ascii.length; i++) {
			System.out.print((char) (ascii[i] + 2));
		}
		
		System.out.println();

		for (int i = 0; i < ascii.length; i++) {
			System.out.print((char) ((ascii[i] * 7) % 80 + 48));
		}
		
		br.close();
	}
}
