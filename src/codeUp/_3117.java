package codeUp;

import java.io.*;
import java.util.*;

public class _3117 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int k = Integer.parseInt(br.readLine());
		int sum = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < k; i++) {
			int item = Integer.parseInt(br.readLine());
			if (item == 0) {
				stack.pop();
			} else {
				stack.push(item);
			}
		}

		for (int i = 0; i < stack.size(); i++) {
			sum += stack.get(i);
		}

		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}

}
