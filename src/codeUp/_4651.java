package codeUp;

import java.io.*;
import java.util.*;

public class _4651 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] yutpalyArr = new int[3][4];

		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 4; j++) {
				int x = Integer.parseInt(st.nextToken());
				yutpalyArr[i][j] = x;
			}
		}

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int[] answer = new int[3];
		
		for (int i = 0; i < 4; i++) {
			sum1 += yutpalyArr[0][i];
		}
		answer[0] = sum1;

		for (int i = 0; i < 4; i++) {
			sum2 += yutpalyArr[1][i];
		}
		answer[1] = sum2;
		
		for (int i = 0; i < 4; i++) {
			sum3 += yutpalyArr[2][i];
		}
		answer[2] = sum3;

		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == 0) {
				bw.write(String.valueOf("D" + "\n"));
			} else if (answer[i] == 1) {
				bw.write(String.valueOf("C" + "\n"));
			} else if (answer[i] == 2) {
				bw.write(String.valueOf("B" + "\n"));
			} else if (answer[i] == 3) {
				bw.write(String.valueOf("A" + "\n"));
			} else if (answer[i] == 4) {
				bw.write(String.valueOf("E" + "\n"));
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
