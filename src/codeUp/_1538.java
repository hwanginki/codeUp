package codeUp;

import java.util.*;

public class _1538 {
	
	static void f(int n) {
		if (n % 2 == 0) {
			 System.out.print("even");
		} else {
			System.out.print("odd");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		f(n);
		sc.close();
		
	}
	
}
