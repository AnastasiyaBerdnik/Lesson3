package by.epam.anastasiya.hometask3;

import java.util.Scanner;

public class LastDigit {
	public static int poslZifra;
	public static int poslZifraKv;
	public static int number = 0;

	public static void main(String[] args) {
		ScanDigit();
		getPoslZifra();
		PrintResult();
	}

	public static void ScanDigit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число: ");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		poslZifra = number % 10;
	}

	public static void getPoslZifra() {

		switch (poslZifra) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;

			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			System.out.println("Что-то не то с программой.");
			return;
		}
	}

	public static void PrintResult() {

		System.out.println("Квадрат числа " + number + " равняется "
				+ poslZifraKv);
	}
}
