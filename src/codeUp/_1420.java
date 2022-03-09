package codeUp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*********************************** 다시 수정하기 ********************************/
public class _1420 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 개수 입력

		HashMap<String, Integer> student = new HashMap<>();

		int[] studentNum = new int[n];

		for (int i = 0; i < n; i++) {
			String name = sc.next(); // 이름 입력
			Integer score = sc.nextInt(); // 점수 입력
			student.put(name, score); // 맵 저장
			for (Integer x : student.values()) {
				studentNum[i] = x; // 배열에 점수를 대입
				System.out.println(x);
			}
		}
	
//		System.out.println(studentNum[1]);
//		System.out.println(studentNum[2]);
//		System.out.println(studentNum[3]);
//		System.out.println(studentNum[4]);
		
//		for (String key : student.keySet()) {
//			Integer value = student.get(key);
//			
//			System.out.println(">>>" + value);
//			if (value == studentNum[n / 2]) {
//				System.out.println(value);
//				break;
//			}
//	}
		sc.close();
	}

}
