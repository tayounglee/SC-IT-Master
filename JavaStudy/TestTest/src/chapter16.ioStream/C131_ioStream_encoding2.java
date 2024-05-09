package chapter15.iostream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class C131_ioStream_encoding2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("애국가.txt");
		InputStreamReader in = new InputStreamReader(fi, "euc-kr");
		char[] text = new char[1000];
		int num = in.read(text);
		System.out.println(text);
		in.close();

	}

}
