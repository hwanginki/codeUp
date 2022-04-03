package codeUp;

import java.io.*;

public class _4011 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] x = br.readLine().toCharArray();

		if (x[7] == '1') {
			bw.write("19" + x[0] + "" + x[1] + "/" +
					x[2] + "" + x[3] + "/" + x[4] + "" + x[5] + " M");
		} else if (x[7] == '2') {
			bw.write("19" + x[0] + "" + x[1] + "/" +
					x[2] + "" + x[3] + "/" + x[4] + "" + x[5] + " F");
		} else if (x[7] == '3') {
			bw.write("20" + x[0] + "" + x[1] + "/" +
					x[2] + "" + x[3] + "/" + x[4] + "" + x[5] + " M");
		} else if (x[7] == '4') {
			bw.write("20" + x[0] + "" + x[1] + "/" +
					x[2] + "" + x[3] + "/" + x[4] + "" + x[5] + " F");
		} 

		bw.flush();
		bw.close();
		br.close();
	}
}
