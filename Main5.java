package by.epam.linear_program.main;

public class Main5 {
    public static void main(String[] args) {

        //5. Дано натуральное число Т, которое представляет длительность прошедшего
        //  времени в секундах. Вывести данное значение длительности в часах, минутах и
        //  секундах в следующей форме: ННч ММмин SSc.

        int countSec = 123456;
        int hour = countSec / 3600;
        int min = (countSec - hour * 3600) / 60;
        int sec = countSec - hour * 3600 - min * 60;
        System.out.println(countSec + " сек. => " + hour + " ч. " + min + " мин. " + sec + " сек. ");
    }
}
