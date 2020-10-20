package by.epam.linear_program.main;

public class Main14 {
    public static void main(String[] args) {
        //3. Найти сумму квадратов первых ста чисел
        int n = 1;
        int sum = 0;
        while (n <= 100) {
            sum = (sum + (n * n));
            n++;
        }
        System.out.println(sum);
    }
}
