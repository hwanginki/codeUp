package codeUp;

import java.io.*;
import java.util.*;

public class _1562 {
	
	public static void f(int x, int y) {
		if (x < y) {
			System.out.print(x);
		} else if (y < x) {
			System.out.print(y);
		} else {
			System.out.print(0);
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		f(x, y);

		br.close();

	}
}
