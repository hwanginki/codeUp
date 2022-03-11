package codeUp;

import java.io.*;

public class _1733 {

	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		sb.append(str);
		
		if (sb.toString().equals("IOI")) {
			bw.write("IOI is the International Olympiad in Informatics.");
		} else {
			bw.write("I don't care.");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
