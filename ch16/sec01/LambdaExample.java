package ch16.sec01;

public class LambdaExample {

	public static void main(String[] args) {

		action((x,y) -> {
			int result = x + y ;
			System.out.println("result : " + result);
		});
		
		action((x,y) -> {
			int result = x - y ;
			System.out.println("result : " + result);
		});
		
		action(new Calculable() {
			
			@Override
			public void calcuate(int x, int y) {
				int re = x * y;
				System.out.println("result : " + re);
			}
		});
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		
		calculable.calcuate(x, y);
	}

}
