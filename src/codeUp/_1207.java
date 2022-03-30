package codeUp;

import java.io.*;
import java.util.*;

public class _1207 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int doo = Integer.parseInt(st.nextToken());
		int gae = Integer.parseInt(st.nextToken());
		int geol = Integer.parseInt(st.nextToken());
		int yuet = Integer.parseInt(st.nextToken());
		
		int sum = doo + gae + geol + yuet;
		
		if (sum == 1) {
			bw.write("도");
		} else if (sum == 2) {
			bw.write("개");
		} else if (sum == 3) {
			bw.write("걸");
		} else if (sum == 4) {
			bw.write("윷");
		} else {
			bw.write("모");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
