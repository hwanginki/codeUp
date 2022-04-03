package codeUp;

import java.io.*;
import java.util.*;

public class _4681 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			int n = Integer.parseInt(st.nextToken());
			list.add(n * n);
		}
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		bw.write(String.valueOf(sum % 10));
		bw.flush();
		bw.close();
		br.close();
	}
	
}
