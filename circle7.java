package by.epam.course.circle7;
// Циклы 	7.	Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры
//

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int m; // инициализируем переменные
		int n; //
		boolean  flag;

		Scanner in = new Scanner(System.in);

		// вводим число m и n и проверяем корректность вводимых данных
		do {
			System.out.println("Введите два натуральных числа m < n через пробел"); // Условие диапазона
			while (!in.hasNextInt() & !in.hasNextInt()) {
				System.out.println("Введите корректные числа"); // введено не число типа Int
				in.next();
				in.next();
			}
			m = in.nextInt();
			n = in.nextInt();
		} while (m > n); // проверяем, что диапазон m<n.

		for (int i = m; i <= n; i++) { // перебираем весь диапазон
			System.out.print("\nДелители числа " + i + "-");
			flag=true;
			for (int j = 2; j <= i/2; j++) { // перебираем все делители
				if (i % j == 0) {
					System.out.print(j + " ");
					flag=false; //сбрасываем флаг, если нет делителей
				}
				
			}
			if (flag) {
				System.out.print("нет делителей");
								}
		}
	}
}


