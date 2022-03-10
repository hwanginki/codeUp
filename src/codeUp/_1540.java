package codeUp;

import java.util.*;

public class _1540 {
	
	static void f(int n) {
		if (0 == n) {
			 System.out.print("zero");
		} else {
			System.out.print("non zero");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		f(n);
		sc.close();
		
	}
	
}
