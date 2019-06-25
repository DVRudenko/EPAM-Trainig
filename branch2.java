package by.epam.course.branching2;

// 2.	Найти max{min(a, b), min(c, d)}

public class Main {
	
	public static void main(String[] args) {
	
		float a=5.2f; //задаем исходные числа
		float b=2.1f; //задаем исходные числа
		float c=1.5f; //задаем исходные числа
		float d=2.3f; //задаем исходные числа
		float min1;
		float min2;
		float max;
				
		// Методы Math.Min и Math.Mах не используем

		min1 = a<b ? a : b;             // находим первый минимум
		min2 = c<d ? c : d;		// находим второй минимум
		max = min1>min2 ? min1 : min2;	// находим максимальное из минимальных
	
		System.out.print(max);
	}

}
