package codeUp;

import java.io.*;
import java.util.*;

// https://coding-factory.tistory.com/534
// https://codechacha.com/ko/java-regex/ (정규표현식_regex)
public class _3102 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int x = Integer.parseInt(br.readLine());
		String[] arr = new String[x];
		Stack<Integer> answer = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("push")) {
				answer.push(Integer.parseInt(arr[i].replaceAll("[^0-9]", "")));
			} else if (arr[i].contains("top")) {
				if (answer.size() == 0) {
					bw.write(-1);
				} else {
					bw.write(String.valueOf(answer.peek()) + "\n");
				}
			} else if (arr[i].contains("pop")) {
				answer.pop();
			} else if (arr[i].contains("size")) {
				bw.write(String.valueOf(answer.size()));
			} else if (arr[i].contains("empty")) {
				bw.write(String.valueOf(answer.empty()));
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
