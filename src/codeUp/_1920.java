package codeUp;

import java.io.*;

/*
Integer.toBinaryString(i); //2진수
Integer.toOctalString(i); //8진수
Integer.toHexString(i); //16진수
 */
public class _1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		bw.write(Integer.toBinaryString(x));
		bw.flush();
		bw.close();
		br.close();
	}
}
