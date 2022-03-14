package codeUp;

import java.io.*;

public class _1468 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int x = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[x][x];
		int cnt = 1;
		
		for (int i = 0; i <  x; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < x; j++) {
					arr[i][j] = cnt++;
				}
			} else {
				for (int j = x - 1; j >= 0; j--) {
					arr[i][j] = cnt++;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				bw.write(arr[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
