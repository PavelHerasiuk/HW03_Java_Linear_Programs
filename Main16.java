package by.epam.linear_program.main;

public class Main16 {
    public static void main(String[] args) {
        //5. Вывести на экран соответствующий между символами и их численными
        // обозначениями в памяти компьютера.

        char ch;
        for (ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " ( " + (byte) ch + " ), ");
        }
        System.out.println(" \n ");
    }
}
