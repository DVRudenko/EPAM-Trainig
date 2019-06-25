package by.epam.course.line2;
// Линенйный 2.	Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//
public class Main {

    public static void main(String[] args) {
        float a=1.5f;
        float b=2.5f;
        float c=3.0f;
        double result;

        result= (b+Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+1/(b*b);
        System.out.println ("Ответ " +result);
    }
}
