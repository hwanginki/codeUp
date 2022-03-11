package codeUp;

import java.io.*;
import java.util.*;

public class _1805 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map.put(x, y);
		}
		
		TreeMap<Integer, Integer> tm = new TreeMap<>(map);

		Iterator<Integer> iteratorKey = tm.keySet().iterator();
		
		while (iteratorKey.hasNext()) {
			Integer integer = (Integer) iteratorKey.next();
			bw.write(integer + " " + tm.get(integer) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
