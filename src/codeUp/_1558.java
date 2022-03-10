package codeUp;

import java.io.*;

public class _1558 {
	
	public static String f(String n) {
		StringBuilder sb = new StringBuilder();
		return sb.append(n).reverse().toString();
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = String.valueOf(br.readLine());
		System.out.println(f(s));
		br.close();
	}
}

