package by.epam.course.circle5;
// Циклы 	5.	Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        float an=1/2f+1/3f; //инициализируем первое значение ряда
        float result=an; // сумма ряда
        int n=1; //счетчик=1
        float e;

       Scanner in = new Scanner (System.in);
      
        // вводим число E и проверяем корректность вводимых данных
        do {
            System.out.println("Введите малое положительное число E более 0 и менее 0,5"); //При других значениях E ряд сразу не сойдется
            while (!in.hasNextFloat()) {
                System.out.println("Введите корректное число"); //введено не число типа float
                in.next();
            }
            e = in.nextFloat();
        } while ((e <= 0)||(e>0.5)); // проверяем, что E - малое число. 

        // System.out.println(n+"-й член ряда = "+an); // для промежуточного контроля результата выводим значение ряда
        while (e<=Math.abs(an)){   //проверка заданного условия 
            n++;
            an = (float) (1/Math.pow(2,n)+1/Math.pow(3,n)); //вычисляем значение ряда по заданной формуле
            //System.out.println(n+"-й член ряда = "+an); // для промежуточного контроля результата выводим значение ряда
            result+=an;
        }

        System.out.println("Сумма = "+result);

    }
}


