package by.epam.course.circle8;
// Циклы 	8.	Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
//

public class Main {

    public static void main(String[] args) {

        float a=1234.567f; //тип чисел любой
        float b=987.654f;
        // float b=8.0f; // вариант когда нет общих цифр
        char symbolA;
        int j;
        boolean flag=false;

        String nameA=Float.toString(a); // преобразуем числа в текстовую строку
        String nameB=Float.toString(b);

        System.out.println("Обшие цифры для чисел "+a+" и "+b+":");

        for (int i = 0; i <= nameA.length()-1 ; i++) {       // перебираем символы первой строки
            symbolA=nameA.charAt(i);
            j=nameB.indexOf(symbolA); // получаем индекс вхождения символа во вторую строку
            if (j>-1&&(symbolA != '.')){ // выводим совпадающие символы кроме точки
                System.out.print(symbolA);
                flag=true;
            }

        }
        if (!flag){
            System.out.println("Нет общих цифр"); // для большей корректности ответа
        }
    }
}


