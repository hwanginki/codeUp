package codeUp;

import java.io.*;
import java.util.*;

public class _4891 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] answer = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			answer[i] = x;
			if (answer[i] >= max) {
				max = answer[i];
			}
			if (min >= answer[i]) {
				min = answer[i];
			}
		}

		bw.write(String.valueOf(max - min));
		bw.flush();
		bw.close();
		br.close();
	}

}
