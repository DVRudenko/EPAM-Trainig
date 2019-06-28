package by.epam.course.branching5;

// Ветвление 5.	Вычислить значение функции при x<=3 и x>3

public class Main {

	public static void main(String[] args) {
		float x=2.5f; // задаем значение
		float result;
		
		// корректность вводимых данных не проверяем

		result=x<=3 ? x*x-3*x+9 : 1/(x*x*x+6);
					
		System.out.println("Значение функции="+result);
	

	}
}
	
