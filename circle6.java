package by.epam.course.circle6;
// Циклы 	6.	Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера
//

public class Main {

    public static void main(String[] args) {

        for (int i = 32; i <= 400; i++) {       // начнем выводить с 32 т.к. меньше управляющие символы Unicode. Выведем до 400 позиций, хотя можно и больше
            System.out.print(i + "-" + (char) i + ", ");
            if (i % 20 == 0) {
                System.out.println(); //вставим перевод строки для лучшей читаемости вывода
            }
        }
    }
}


