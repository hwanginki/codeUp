package codeUp;

import java.io.*;
import java.util.*;

public class _1566 {

	public static long pow(int x, int y) {
		
		return (long) Math.pow(x, y);

//		if (y == 0) {
//			return 1;
//		} else {
//			return (long) x * pow(x, y - 1);
//		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		System.out.println(pow(x, y));

		br.close();

	}
}
