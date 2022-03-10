package codeUp;

import java.util.*;

public class _1548 {
	
	static void f(int n) {
		if (n >= 90) {
			System.out.print("A");
		} else if (n >= 80) {
			System.out.print("B");
		} else if (n >= 70) {
			System.out.print("C");
		} else if (n >= 60) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		f(sc.nextInt());
		sc.close();
		
	}
	
}
