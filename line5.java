package by.epam.course.line1;
// Линенйный 5.	Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
//
public class Main {

    public static void main(String[] args) {
        int t=123456;   // задаем количество секунд
        int hour;
        int min;
        int sec;

        hour=(int) t/3600;              //вычисляем часы
        min=(int) (t-hour*3600)/60;     //вычисляем минуты
        sec= t-hour*3600-min*60;        //вычисляем секунды

        System.out.println(hour+"ч "+min+"мин "+sec+"с");

    }
}
