package ch05.sec99;

public class ThreeDimension {
	
	//삼차원 배열 만들기
	public static void main(String[] args) {
		int[][][] Ba = new int [3][2][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 3; k++) {
					
					Ba[i][j][k] = i*10+j*3+(k+1);
					System.out.printf("%02d ", Ba[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
}
