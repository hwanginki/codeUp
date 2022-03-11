package codeUp;

import java.io.*;

public class _2625 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int a = 1; a < n; a++) {
			for (int b = 1; b < n; b++) {
				for (int c = 1; c < n; c++) {
					if (a <= b && b <= c && a + b > c && a + b + c == n) {
						cnt++;
					}
				}
			}
		}
		System.out.print(cnt);
		br.close();
	}
}
