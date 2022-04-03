package codeUp;

import java.io.*;
import java.util.*;
import java.util.Map.*;

public class _4536 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();

		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int x = Integer.parseInt(br.readLine());
			al.add(x);
			sum += al.get(i);
		}

		for (Integer integer : al) {
			hm.put(integer, hm.getOrDefault(integer, 0) + 1);
		}

		Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}

		};

		Entry<Integer, Integer> maxEntry = Collections.max(hm.entrySet(), comparator);

		bw.write(String.valueOf(sum / 10) + "\n");
		bw.write("" + maxEntry.getKey());
		bw.flush();
		bw.close();
		br.close();
	}

}
