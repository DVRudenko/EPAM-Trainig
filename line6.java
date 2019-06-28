package by.epam.course.line6;
// Линенйный 6.	Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае
//
public class Main {

    public static void main(String[] args) {
        float x=-3.0f;    //тип переменных не оговаривался
        float y=-3.0f;    //тип переменных не оговаривался
        boolean result;
        boolean isUp;
        boolean isLow;

        isLow = (x>=-4 && x<=4) && (y>=-3 && y<=0); // попадает ли в нижнюю часть области
        isUp=(x>=-2 && x<=2) && (y>=0 && y<=4);     // попадает ли в верхнюю часть области
        result= isUp||isLow;
        

        // вариант записи решения в одну строку
        // result=((x>=-4 && x<=4) && (y>=-3 && y<=0))||((x>=-2 && x<=2) && (y>=0 && y<=4));
        

        System.out.println(result);

    }
}
