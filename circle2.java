package by.epam.course.circle2;
// Циклы 	1.	3.	Вычислить значения функции на отрезке [а,b] c шагом h
//

public class Main {

    public static void main(String[] args) {
        float a = -5.0f;   //задаем начало отрезка
        float b = 15.0f;  // задаем конец отрезка
        float h=1.5f; // задаем шаг
        float result;

        if ((a > b) || (b-a) < h) {
            System.out.println("не верно заданы параметры функции");
        } else {
            for (float x=a; x<=b; x+=h){
                result = x>2 ? x : -x;
                System.out.println("для x="+x + "y="+result);
            }
        }
    }
}


