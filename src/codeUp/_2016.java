package codeUp;

import java.io.*;

// https://godog.tistory.com/entry/Java-DecimalFormat-%EC%B2%9C%EB%8B%A8%EC%9C%84%EB%A7%88%EB%8B%A4-%EC%89%BC%ED%91%9C-%EC%9E%85%EB%A0%A5
// https://coding-factory.tistory.com/734

public class _2016 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		String y = br.readLine().replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");
		
		bw.write(String.valueOf(y));
		bw.flush();
		bw.close();
		br.close();
	}
}
