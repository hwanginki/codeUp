package codeUp;

import java.io.*;
import java.util.*;

public class _1567 {

	public static long pow(long x, long[] arr, long start, long end) {
		long sum = 0;
		for (long i = start - 1; i < end; i++) {
			sum += arr[(int) i];
		}
		return (long) sum;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		long start = Integer.parseInt(st1.nextToken());
		long end = Integer.parseInt(st1.nextToken());

		long[] arr = new long[x];

		for (int i = 0; i < x; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.print(pow(x, arr, start, end));

		br.close();

	}
}
