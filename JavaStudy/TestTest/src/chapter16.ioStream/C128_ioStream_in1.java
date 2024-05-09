package chapter15.iostream;

import java.io.FileInputStream;

public class C128_ioStream_in1 {

	public static void main(String[] args) throws Exception {
/*
	바이트 기반 스트림: 데이터가 이동하는 통로를 직접 만드는 클래스
	보조 스트림: 이미 만들어져 있는 통로에 새로운 기능을 추가하는 클래스
	
					입력						출력
	바이트	최상위	InputStream			OutputStream
			하위		FileInputStream		FileOutputStream
					ObjectInputStream	ObjectOutputStream
	
	vs
	
	문자		최상위	Reader				Writer
			하위		BufferedReader		BufferedWriter
					InputStreamReader	OutputStreamWriter
 */
		FileInputStream in = new FileInputStream("test.txt");
		int avail = in.available();		//스트림에서 읽을 수 있는 바이트 개수 리턴
		System.out.println(avail);
		byte[] data = new byte[avail];
		in.read(data);		//지정된 배열 크기만큼 읽고 버퍼배열에 저장, 읽은 개수 리턴
		in.close();		//스트림 닫고 자원해제
		for (byte b : data) {
			System.out.print(b);
		}
	}

}
