package chapter15.iostream;

import java.io.File;
import java.io.FileWriter;

public class C136_file_makedir {

	public static void main(String[] args) throws Exception {
		File folder = new File("C:\\TestFolder2");
		if (folder.mkdir()) {	//새로운 디렉토리를 생성
			File file = new File("c:\\TestFolder2\\MyFile.txt");
			if (file.createNewFile()) {		//새로운 파일을 생성
				FileWriter out = new FileWriter(file);
				out.write("테스트 파일");
				out.close();
			}
		}
	}

}
