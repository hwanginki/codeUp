package codeUp;

import java.util.*;

public class _1541 {
	
	static void f(int n) {
		if (0 == n) {
			 System.out.print("zero");
		} else if (0 > n) {
			System.out.println("negative");
		} else {
			System.out.print("positive");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		f(n);
		sc.close();
		
	}
	
}
