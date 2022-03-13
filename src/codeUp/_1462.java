package codeUp;

import java.io.*;

public class _1462 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n + 1];
		int cnt = 1;

		for (int i = 0; i < n; i++) {
			arr[i][0] = cnt;
			for (int j = 0; j < n; j++) {
				arr[i][j + 1] = ((arr[i][j]) + n);
				bw.write(String.valueOf(arr[i][j] + " "));
			}
			cnt++;
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
