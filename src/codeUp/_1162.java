package codeUp;

import java.util.*;

public class _1162 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int save = year - month + day;
		
		String daeback = Integer.toString(save); 
		
		char lastChar = daeback.charAt(daeback.length() - 1);
		
		if (lastChar == '0') {
			System.out.println("대박");
		} else {
			System.out.println("그럭저럭");
		}
		
		sc.close();
	}

}
