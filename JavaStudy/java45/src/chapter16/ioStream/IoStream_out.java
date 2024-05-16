package chapter16.ioStream;

import java.io.*;

public class IoStream_out {
	public static void main(String[] args) throws Exception {
		FileReader in = new FileReader("src/test.txt");
		int ch;
		for(;;) {
			ch = in.read();
			if(ch == -1) break;
			System.out.println((char) ch);
		}
		in.close();
		
		in = new FileReader("src/test.txt");
		char[] text = new char[100];
		int num = in.read(text);
		System.out.println("읽은 문자 개수 = " + num);
		System.out.println(text);
		in.close();
	}
}
