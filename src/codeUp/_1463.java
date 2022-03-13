package codeUp;

import java.io.*;

public class _1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = ((n - i) + (j * n));
				bw.write(arr[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
}
