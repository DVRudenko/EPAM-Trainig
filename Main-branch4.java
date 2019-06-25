package by.epam.course.branching4;

// Ветвление 4.	Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие

public class Main {

	public static void main(String[] args) {
		float a=2.0f; // размеры отверстия
		float b=1.0f;
		float x=3.0f; // размеры кирпича
		float y=2.0f;
		float z=2.0f;
	
		boolean isInHole;
		boolean side1;
		boolean side2;
		boolean side3;
		
		// корректность вводимых данных не проверяем

		side1=(a>=x) && (b>=y)||(a>=y) && (b>=x); // Проходит стороной 1
		side2=(a>=x) && (b>=z)||(a>=z) && (b>=x); // Проходит стороной 2
		side3=(a>=z) && (b>=y)||(a>=y) && (b>=z); // Проходит стороной 3
		
		
		isInHole=side1||side2||side3; // Проходит ли в отверстие любой из сторон
					
		if (isInHole) {
			System.out.println("Кирпич пройдет");
		}
		else {
			System.out.println("Кирпич не пройдет");
		}

	}
}
	
