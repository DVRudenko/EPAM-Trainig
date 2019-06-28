package by.epam.course.branching1;
// Ветвления 	1.	Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным
//

public class Main {

    public static void main(String[] args) {
        float a = 45.0f;   //задаем первый угол в градусах
        float b = 45.0f;  // задаем второй угол в градусах

        if (a <= 0 || a >= 360 || b <= 0 || b >= 360) {
            System.out.println("не верно заданы углы треугольника");
        } else if (a + b == 90) {
            System.out.println("треугольник прямоугольный");
        } else if ((a + b) < 180) {
            System.out.println("треугольник существует");
        } else {
            System.out.println(" треугольник не существует");
        }
    }
}



