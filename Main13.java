package by.epam.linear_program.main;

public class Main13 {
    public static void main(String[] args) {
        //2. Вычислить значения функции на отрезке [а, b] c шагом h:
        double a = 0.0;
        double b = 4.0;
        double h = 0.5;
        double x = 0;
        double y;
        for (x = 0; x <= b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println(h + " | " + y);
        }
    }
}
