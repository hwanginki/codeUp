package codeUp;

import java.io.*;
import java.util.*;

public class _1714 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String in = String.valueOf(br.readLine());
		
		char[] stArr = in.toCharArray();
		
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < in.length(); i++) {
			stack.push(Character.getNumericValue(stArr[i]));
		}
		
		while (!stack.isEmpty()) {
			Integer item = stack.pop();
			bw.write(String.valueOf(item));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
