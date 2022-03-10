package codeUp;

import java.io.*;
import java.util.*;

public class _1578 {

	public static int mymax(int n, int m) {
		int max = Math.max(n, m);
		return max;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		br.close();
		
		System.out.print(mymax(n, m));
		
	}
}
