package chapter15.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable { //직렬화를 하겠다는 의도를 표시
	

	/**
	 * 객체 고유 번호
	 */
/*
	Serializable 인터페이스를 구현하는 모든 직렬화된 클래스는 serialVersionUID(이하 SUID) 이라는 고유 식별번호를 부여 받는다. 
	이 식별 ID는 클래스를 직렬화, 역직렬화 과정에서 동일한 특성을 갖는지 확인하는데 사용된다. 
 */
	private static final long serialVersionUID = -5796917796117705757L;
	
	String name;
	transient String job;	// 직렬화 대상 제외
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class C134_serialization {

	public static void main(String[] args) throws ClassNotFoundException {
/*
	데이터 직렬화 종류
	 - CSV, XML, JSON 직렬화
	 - Binary 직렬화
	 - Java 직렬화
 */
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		//직렬화
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch(IOException e) {
			e.printStackTrace();
		}

		//역직렬화
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
				Person p1 = (Person) ois.readObject();
				Person p2 = (Person) ois.readObject();
				
				System.out.println(p1);
				System.out.println(p2);
			} catch(IOException e) {
				e.printStackTrace();
			}
	}

}
