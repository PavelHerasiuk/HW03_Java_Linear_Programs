package by.epam.linear_program.main;

public class Main4 {
    public static void main(String[] args) {
        // 4.  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной
        // и целой части). Поменять местами дробную и целую части числа и вывести
        // полученное значение числа.

        double R = 123.456;
        int i = (int) R;
        int j = (int) ((R - i) * 1000);
        // j = (123.456-123)*1000=456
        double k = (double) i / 1000;
        double r = j + k;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(r);
    }
}
