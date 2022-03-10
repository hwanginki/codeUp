package codeUp;

import java.util.*;

public class _1546 {
	
	static void f(int n) {
		if (n == 0) {
			System.out.print("zero");
		} else if (n < 0) {
			System.out.print("minus");
		} else {
			System.out.print("plus");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		f(sc.nextInt());
		sc.close();
		
	}
	
}
