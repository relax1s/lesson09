package by.relax1s.lesson09.main;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		double x;
		x = inputDoubleFromConsole("Введите первое значение: ");

		double sum;
		sum = addition(x);

		simplePrint(x, sum);
		richPrint(x, sum);
	}

	public static double inputDoubleFromConsole(String message) {
		double x;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(message);
			while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.print("Неверный ввод. " + message);
			}
			x = sc.nextDouble();
		}
		return x;
	}

	public static double addition(double x) {
		double sum;
		sum = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
		return sum;
	}

	public static void simplePrint(double x, double sum) {
		System.out.println("Результат x =  " + x + " = " + sum);
	}

	public static void richPrint(double x, double sum) {
		System.out.printf("Результат  x = [%.2f] = [%.4f]", x, sum);
	}

}
