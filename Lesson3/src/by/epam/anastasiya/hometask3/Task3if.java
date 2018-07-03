package by.epam.anastasiya.hometask3;

import java.util.Scanner;

public class Task3if {
	public static void main(String[] args) {
		double x;
		double y;
		double r = 2;
		x = 0;
		y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter x = ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}

		if (x <= -3) {
			y = 9;
		}

		else {
			y = 1 / (Math.pow(x, r) + 1);
		}

		System.out.println("y = " + y);
	}
}
