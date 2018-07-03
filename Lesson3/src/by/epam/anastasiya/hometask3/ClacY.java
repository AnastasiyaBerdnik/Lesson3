package by.epam.anastasiya.hometask3;

public class ClacY {
	
	public static double calcY(double x){
		double fx;
		if (x >= 3) {
			fx = -x * x + 3 * x + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) - 6);
		}
		
		return fx;
	}

}
