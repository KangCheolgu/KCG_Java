package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {

//		for (int m = 2; m <= 9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for (int n = 1; n <= 9; n++) {
//				System.out.println(m + " * " + n + " = " + (m * n));
//			}
//		}
		for (int k = 0; k < 2; k++) {
			for (int n = 1; n <= 9; n++) {
				for (int m = 2+(k*4); m <= 5+(k*4); m++) {
//					System.out.print(m + " * " + n + " = " + (m * n)+ "  ");
//					System.out.print(m+" x "+n+" = " + String.format("%2d", m*n) + "  ");
					System.out.printf("%d X %d = %2d  ", m, n, m*n);

				}
				System.out.println();
			}
		}
	}

}
