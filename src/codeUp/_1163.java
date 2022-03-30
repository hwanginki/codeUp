package codeUp;

import java.io.*;
import java.util.*;

public class _1163 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		int sum = year + month + day;
		
		if (((sum % 1000) / 100) % 2 == 0) {
			bw.write("대박");
		} else {
			bw.write("그럭저럭");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
