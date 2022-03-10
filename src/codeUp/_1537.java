package codeUp;

import java.util.*;

public class _1537 {
	
	static void f(int n) {
		if (n == 1) {
			 System.out.print("hello");
		} else if (n == 2) {
			System.out.print("world");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		f(n);
		sc.close();
		
	}
	
}
