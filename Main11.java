package by.epam.linear_program.main;

public class Main11 {
    public static void main(String[] args) {
        //5. Вычислить значение функции: если x <= 3; x > 3.
        int x = 3;
        double y;
        if (x <= 3) {
            y = Math.pow(x, 2) + 3 * x + 9;
            System.out.println(" у = " + y);
        }
        if (x > 3) {
            y = 1 / (Math.pow(x, 3) + 6);
            System.out.println(" у = " + y);
        }
    }
}
