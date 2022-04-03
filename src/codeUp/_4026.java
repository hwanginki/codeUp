package codeUp;

import java.io.*;
import java.util.*;

public class _4026 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			int x = Integer.parseInt(st.nextToken());
			al.add(x);
		}
		
		Collections.sort(al);
		
		bw.write(String.valueOf(al.get(2)));
		bw.flush();
		bw.close();
		br.close();
	}
	
}
