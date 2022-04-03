package codeUp;

import java.io.*;
import java.util.*;

public class _4626 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n]; // 채점
		int[] arr_answer = new int[n];
		int sum = 0;
		int cnt = 1;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			arr[i] = x;
		}

		for (int i = 0; i < arr_answer.length; i++) {
			if (arr[i] == 1) { // 채점 1일 때
				arr_answer[i] = cnt;
				sum += cnt;
				cnt++;
			} else {
				arr_answer[i] = 0;
				cnt = 1;
			}
		}

		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}

}
