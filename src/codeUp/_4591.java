package codeUp;

import java.io.*;
import java.util.*;
import java.util.Map.*;

public class _4591 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < 9; i++) {
			int x = Integer.parseInt(br.readLine());
			al.add(x);
			hm.put(i + 1, x);
		}

		Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}

		};

		Entry<Integer, Integer> maxEntry = Collections.max(hm.entrySet(), comparator);

		bw.write(String.valueOf(Collections.max(al)) + "\n");
		bw.write(String.valueOf(maxEntry.getKey()));
		bw.flush();
		bw.close();
		br.close();
	}

}
