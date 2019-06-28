package by.epam.course.circle4;
// Циклы 	4.	Составить программу нахождения произведения квадратов первых двухсот чисел
//

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        BigInteger result= BigInteger.valueOf(1); // инициализируем переменную типа BigInteger

        for (int i=1; i<=200; i++){
            result = result.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println("Вот Ваш результат = "+result);

    }
}


