package codeUp;

import java.io.*;
import java.util.*;

public class _4531 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> al = new ArrayList<>();
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int x = Integer.parseInt(br.readLine());
			al.add(x);
			sum += al.get(i);
		}
		bw.write(String.valueOf(sum / 5) + "\n");

		Collections.sort(al);
		bw.write("" + al.get(2));
		bw.flush();
		bw.close();
		br.close();
	}
	
}
