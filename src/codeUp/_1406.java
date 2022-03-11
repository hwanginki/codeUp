package codeUp;

import java.io.*;

public class _1406 {

	public static void main(String[] args) throws IOException {
		// 1. 방법, 시간 102
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		sb.append(str);
		
		if (sb.toString().equals("love")) {
			bw.write("I " + str + " you.");
		}

		bw.flush();
		bw.close();
		br.close();
		
		// 2. 방법, 시간 87
		/*
		 * StringBuilder sb = new StringBuilder(); BufferedReader br = new
		 * BufferedReader(new InputStreamReader(System.in));
		 * 
		 * String str = br.readLine(); sb.append(str);
		 * 
		 * if (sb.toString().equals("love")) { System.out.print("I " + str + " you."); }
		 * br.close();
		 */
	}
}
