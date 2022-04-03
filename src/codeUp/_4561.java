package codeUp;

import java.io.*;
import java.util.*;

public class _4561 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> al = new ArrayList<>();

		int sum = 0;

		for (int i = 0; i < 7; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x % 2 == 1) {
				al.add(x);
				sum += x;
			}
		}
		bw.write(String.valueOf(sum) + "\n");
		bw.write(String.valueOf(Collections.min(al)));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
