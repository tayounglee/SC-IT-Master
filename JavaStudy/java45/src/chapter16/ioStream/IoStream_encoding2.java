package chapter16.ioStream;

import java.io.*;

public class IoStream_encoding2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("애국가.txt");
		InputStreamReader in = new InputStreamReader(fi, "euc-kr");
		char[] text = new char[100];
		int num = in.read(text);
		System.out.println(text);
		in.close();
	}
}
