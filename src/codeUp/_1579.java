package codeUp;

import java.io.*;
import java.util.*;

public class _1579 {

	public static int mymin(int n, int m) {
		int min = Math.min(n, m);
		return min;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		br.close();
		
		System.out.print(mymin(n, m));
		
	}
}
