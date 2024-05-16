package chapter16.ioStream;

import java.io.*;

class Person implements Serializable{ // 직렬화를 하겠다는 의도를 표시
	
	private static final long serialVersionUID = 1L;    //SUID
	String name;
	transient String job; // 직렬화 대상 제외
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
}

public class Serializetion {

	public static void main(String[] args) throws ClassNotFoundException {
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		//직렬화
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch(IOException e){
			e.printStackTrace();
		}
		
		//역직렬화
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}