package by.epam.linear_program.main;

public class Main2 {
    public static void main(String[] args) {
        // 2. Вычислить значение выражения по формуле (все переменные принимают
        // действительные значения): ( b + √b2 + 4ac) / 2a - a3c + b − 2
        double a = 1.2;
        double b = 3.4;
        double c = 5.6;
        double d = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(d);
    }
}
