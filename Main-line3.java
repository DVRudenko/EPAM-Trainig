package by.epam.course.line3;
// Линенйный 3.	Вычислить значение выражения по формуле (все переменные принимают действительные значения
//
public class Main {

    public static void main(String[] args) {
        float x=1.5f;
        float y=2.5f;
        double result;

        result= (Math.sin(x)+Math.cos (y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println ("Ответ " +result);
    }
}
