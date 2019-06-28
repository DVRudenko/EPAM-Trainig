package by.epam.course.branching3;

// ¬етвление 3.	ƒаны три точки ј(х1,у1), ¬(х2,у2) и —(х3,у3). ќпределить, будут ли они расположены на одной пр€мой

public class Main {

	public static void main(String[] args) {
		
		float x1=1.0f; // задаем координаты исходных точек
		float x2=2.0f; // задаем координаты исходных точек
		float x3=3.0f; // задаем координаты исходных точек
		float y1=1.0f; // задаем координаты исходных точек
		float y2=2.0f; // задаем координаты исходных точек
		float y3=3.0f; // задаем координаты исходных точек
		boolean isOnStraight;
		final float APPROX=1E-10f; // вадрат допустимой погрешности
				
		isOnStraight=Math.pow(0.5*((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)),2)<=APPROX; // Ћежат ли точки на одной пр€мой? (через площадь треугольника)
					
		if (isOnStraight) {
			System.out.println("“очки лежат на одной пр€мой");
		}
		else {
			System.out.println("“очки не лежат на одной пр€мой");
		}

	}
}
	
