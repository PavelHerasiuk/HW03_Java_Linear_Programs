package by.epam.linear_program.main;

public class Main15 {
    public static void main(String[] args) {
        //4. Составить программу нахождения произведения квадратов первых двухсот чисел.
        double i = 1;
        double pr = 0;
        while (i <= 200) {
            pr = (long) Math.pow(i, 2);
            i++;
        }
        System.out.println(pr);
    }
}
