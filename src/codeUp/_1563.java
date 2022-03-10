package codeUp;

import java.io.*;
import java.util.*;

public class _1563 {
	
	public static void f(int x, int y, int z) {
		int arr[] = {x, y, z};
		Arrays.sort(arr);
		System.out.print(arr[3/2]);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());

		f(x, y, z);

		br.close();

	}
}
