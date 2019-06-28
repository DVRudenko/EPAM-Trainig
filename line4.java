package by.epam.course.line4;
// Линенйный 4.	Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
// Поменять местами дробную и целую части числа и вывести полученное значение числа
//
public class Main {

    public static void main(String[] args) {
        float r=123.456f;
        float result;

        int   int1; //для целой части
        float frac1; // для дробной части

        int1= (int) ((r-(int)r)*1000); //переставляем целую часть
        frac1= (float) ((int)r/1000.0); //переставляем дробную часть

        result= int1+frac1;

        System.out.println ("Ответ " +result);

    }
}
