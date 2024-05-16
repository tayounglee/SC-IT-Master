package chapter16.ioStream;

import java.io.*;

public class IoStream_in2 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("src/test.txt");
		int data;
		for(;;) {
			data = in.read();
			if(data == -1) break;
			System.out.println(data);
		}
		in.close();
	}
}