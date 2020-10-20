package by.epam.linear_program.main;

public class Main3 {
    public static void main(String[] args) {
        // 3. Вычислить значение выражения по формуле (все переменные принимают
        // действительные значения):
        double x = 20;
        double y = 10;
        double q = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);
        System.out.println(q);
    }
}
