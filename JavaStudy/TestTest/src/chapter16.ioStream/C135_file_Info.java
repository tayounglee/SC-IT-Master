package chapter15.iostream;

import java.io.File;

public class C135_file_Info {

	public static void main(String[] args) {
/*
	File 객체를 생성하는 클래스
	파일 또는 폴더에 대한 정보를 제공하는 클래스
 */
		File f = new File("C:\\eclipseWS\\fileTest.txt");
		if (f.exists()) {	//존재 여부
			if (f.isFile()) {	//경로가 파일인지 검사
				System.out.println("파일입니다.");
				System.out.println("파일경로 : " + f.getParent());
				System.out.println("파일경로2 : " + f.getPath());
				System.out.println("파일이름 : " + f.getName());
				System.out.println("파일크기 : " + f.length());
				System.out.println("숨김 파일 : " + f.isHidden());
				System.out.println("절대 경로 : " + f.isAbsolute());
			} else if (f.isDirectory()) {	//경로가 디렉토리인지 검사
				System.out.println("디렉터리입니다.");
			}
		} else {
			System.out.println("파일이 없습니다.");
		}
	}

}
