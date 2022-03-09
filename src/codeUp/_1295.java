package codeUp;

import java.util.*;

public class _1295 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		char[] b = input.toCharArray();
		
		for (int i = 0; i < b.length; i++) {
			if (Character.isUpperCase(b[i])) { // 대문자이면
				b[i] = (char) (b[i] + 32);
			} else if (Character.isLowerCase(b[i])) { // 소문자이면
				b[i] = (char) (b[i] - 32);
			}
		}
		System.out.println(b);
		sc.close();
	}

}
