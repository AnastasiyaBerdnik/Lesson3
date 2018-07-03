package by.epam.anastasiya.hometask3;

import java.util.Scanner;

public class HometaskFx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0, Fx = 0;

		System.out.println("Введите x =");

		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		} else {
			String s = sc.next();
			System.out.println("Вы ввели некорректное число");
			return;
		}

		for (int i = 0; i <= 10; i++) {
			Fx = 2 * Math.tan(x / 2) + 1;
		}
		if (x > 10) {
			System.out.println("Введите число от 1 до 10");
			return;
		}
        System.out.println ("-----------------------------------------");
		System.out.println("x =  " + x + "        | y = " + Fx);
		

	}
	}

