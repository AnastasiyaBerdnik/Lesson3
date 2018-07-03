package by.epam.anastasiya.hometask3;

import java.util.Scanner;

public class Line01 {
public static int number = 0, digit = 0;

public static void main(String[] args) {
	EnterValues();
	ValuesLogic();
}
public static void EnterValues(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Введите число: ");
	if (sc.hasNextInt())
	number = sc.nextInt();
	}

public static void ValuesLogic(){
	while (number != 0) {
		digit = number % 10;
		number = number / 10;
		if (digit % 2 == 0) {
		System.out.println("В числе есть четная цифра.");
		return;
}
		
	}
	System.out.println("В числе нет четных цифр.");
	}
}


