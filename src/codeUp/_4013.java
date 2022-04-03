package codeUp;

import java.io.*;

public class _4013 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		bw.write("2 " + Integer.toBinaryString(n) + "\n");
		bw.write("8 " + Integer.toOctalString(n) + "\n");
		bw.write("16 " + Integer.toHexString(n).toUpperCase() + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
