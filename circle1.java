package by.epam.course.circle1;

// Циклы 1.	Напишите программу, где пользователь вводит любое целое положительное число. 
// А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int result=0;
		
		Scanner in = new Scanner (System.in);
				
		// вводим число и проверяем корректность вводимых данных 
		do {
			System.out.println("Введите целое положительное число");
			while (!in.hasNextInt()) {
				System.out.println("Введите корректное число");
				in.next();
			}
			n = in.nextInt();
		} while (n <= 0);
		// находим сумму
		for (int i=1; i<=n; i++) {
			result+=i;
		}
					
		System.out.println("Сумма="+result);
	
	}
}
	
