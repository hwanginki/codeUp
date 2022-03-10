package codeUp;

import java.io.*;
import java.util.*;

public class _1581 {

	public static void myswap(int n, int m) {
		
		int tmp = n;
		n = m;
		m = tmp;
		
		System.out.print(n + " " + m);
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		br.close();
		
		myswap(n, m);
		
	}
}
