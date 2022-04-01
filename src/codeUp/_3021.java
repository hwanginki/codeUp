package codeUp;

import java.io.*;
import java.math.BigInteger;

public class _3021 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		BigInteger x = new BigInteger(br.readLine());
		BigInteger y = new BigInteger(br.readLine());
		
		System.out.println(x.add(y));
		bw.flush();
		bw.close();
		br.close();
	}
}
