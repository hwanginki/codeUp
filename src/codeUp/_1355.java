package codeUp;

import java.io.*;

public class _1355 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) { // 세로
			for (int j = i + 1; j <= n; j++) { // 가로
				System.out.print("*");
			}
			System.out.println();
		}
		br.close();
	}
}
