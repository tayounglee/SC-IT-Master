package chapter09.inheritance;

class Tool {
	String name;
	
	Tool(String name){
		this.name = name;
	}
}

class Human5 {
	Tool tool;		//멤버 변수
	
	Human5(String toolName){		//생성자
		this.tool = new Tool(toolName);
	}
	
	void use() {		//멤버 메서드
		System.out.println(tool.name + "을/를 사용하다");
	}
	
}

public class Has_a {

	public static void main(String[] args) {
/*
* 		has a relation
* 		포함, 구성 관계		
*/	
		Human5 h = new Human5("파이어스틸");
		System.out.println(h.tool.name);		//인스턴스(Human5(클래스)타입 h)의 멤버변수(클래스 타입 tool)의 멤버변수(String name)를 호출
		h.use();
	}

}
