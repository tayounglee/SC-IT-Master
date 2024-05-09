package chapter15.iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class C127_ioStream_out {

	public static void main(String[] args) {
/*
	Java 입출력
	지금까지 기본적으로 자바에서 입출력을 위해 사용하던 것은 Scanner 와 print 이다. 
	이것들은 자바에서 가장 쉽게 입출력을 구현할 수 있는 수단이고, 
	때문에 그냥 단순히 입출력하는 방법 으로만 알아왔다.
	사실 컴퓨터에서는 이러한 입력과 출력 즉, Input과 Output 을 줄여서 I/O 라고 한다. 
	자바에서는 이러한 모든 I/O 가 Stream(스트림) 을 통해 이루어진다.
	
	그렇다면 Stream(스트림) 은 무엇일까? 
	스트림은 쉽게 이야기해서 Byte 형태로 데이터를 운반하는데 사용되는 연결통로 라고 생각하면 된다. 
	이는 자료(data)의 흐름이 물의 흐름과 같다는 의미에서 사용되었다고 한다. 
	다만 물이 한쪽 방향으로만 흐르는 것과 같이 스트림은 단방향 통신만 가능하기 때문에 
	하나의 스트림으로 입력과 출력을 동시에 처리 할 수 없다. 
 */
		byte[] data = { 8, 9, 0, 6, 2, 9, 9 };
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("test.txt");
			out.write(data);	//바이트배열 출력하기
			System.out.println("Write success");
		}
		catch (IOException e) {
			System.out.println("File output error");
		}
		finally {
			try {
				out.close();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
