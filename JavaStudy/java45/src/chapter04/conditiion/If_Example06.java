package chapter04.conditiion;

import java.util.*;

public class If_Example06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double height, weight;
		
		height = scan.nextDouble() / 100;
		weight = scan.nextDouble();
		double bmi = (weight / (height * height));
		if(bmi < 25 && bmi >= 23) {
			System.out.println("BMI지수: " + bmi + "(과체중)");
		}
		else if(bmi < 23 && bmi >= 18.5) {
			System.out.println("BMI지수: " + bmi + "(정상)");
		}
		else if(bmi < 18.5) {
			System.out.println("BMI지수: " + bmi + "(저체중)");
		}
		else {
			System.out.println("BMI지수: " + bmi + "(비만)");
		}	
	}
}