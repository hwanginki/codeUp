package codeUp;

import java.util.*;

public class _1024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        
        char[] a = n.toCharArray();
        
        for (int i = 0; i < n.length(); i++) {
			System.out.println("'" + a[i] + "'");
		}
		sc.close();
	}

}
