package ch06.sec08.exam05;

public class CalculatorExam {
	public static void main(String[] args) {
		
		Triangle myCalcu = new Triangle();
		
		double result = myCalcu.areaTriangle(10, 20);
		
		System.out.println("삼각형의 넚이 = " + result);
	}


}
