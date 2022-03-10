package codeUp;

import java.util.*;

public class _1545 {
	
	static void f(int n) {
		if (n == 0) {
			System.out.print("zero");
		} else {
			System.out.print("non zero");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		f(sc.nextInt());
		sc.close();
		
	}
	
}
