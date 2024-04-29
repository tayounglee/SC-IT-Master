package chapter11.interface_part;

abstract sealed class Language permits Java, Cpp, CSharp {}
final class Java extends Language{}
//final class Cpp extends Language{}
//final class CSharp extends Language{}
//final class Python extends Language{} // 상속 제한

//final class OpenJava exnteds Java{} // 상속 제한
sealed class Cpp extends Language permits C11, C20{}
non-sealed class CSharp extends Language{}

final class C11 extends Cpp{}
final class C20 extends Cpp{}

final class CSharpCore extends CSharp{}
final class CSharpCore2 extends CSharp{}

public class Abstract_Sealed {

	public static void main(String[] args) {
		/* 상속 제한
		 * final : 더이상 파생할 수 없다.
		 * sealed : 지정한 후손에 대해서만 파생을 허가
		 * non-sealed : 제한 없이 파생시킬 수 있다.
		*/
		Language lang_java = new Java();
		Language lang_cpp = new Cpp();
		Language lang_cSharp = new CSharp();
		outLanguageName(lang_java);
		outLanguageName(lang_cpp);
		outLanguageName(lang_cSharp);
	}
	
	public static void outLanguageName(Language lang) {
		if(lang instanceof Java) {
			System.out.println("자바");
		}
		else if(lang instanceof Cpp) {
			System.out.println("C++");
		}
		else if(lang instanceof CSharp) {
			System.out.println("C#");
		}
	}
}