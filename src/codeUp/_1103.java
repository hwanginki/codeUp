package codeUp;

import java.io.*;

public class _1103 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\"c:\\test\"");
		bw.flush();
		bw.close();
	}
}
