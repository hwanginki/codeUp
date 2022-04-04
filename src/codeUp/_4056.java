package codeUp;

import java.io.*;

public class _4056 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int x = Integer.parseInt(br.readLine());

		if (x <= 500) {
			bw.write(String.valueOf(x * 70 / 100));
		} else if (x > 500 && x <= 1500) {
			bw.write(String.valueOf(350 + (x - 500) * 40 / 100));
		} else if (x > 1500 && x <= 4500) {
			bw.write(String.valueOf(750 + (x - 1500) * 15 / 100));
		} else if (x > 4500 && x <= 10000) {
			bw.write(String.valueOf(1200 + (x - 4500) * 5 / 100));
		} else if (x > 10000) {
			bw.write(String.valueOf(1475 + (x - 10000) * 2 / 100));
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
