package by.epam.linear_program.main;

public class Main10 {
    public static void main(String[] args) {
        //4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
        // Определить, пройдет ли кирпич через отверстие.
        int A = 1;
        int B = 2;
        int x = 3;
        int y = 4;
        int z = 5;
        if (((x <= A) && (y <= B)) || ((x <= B) && (y <= A)) || ((x <= A) && (z <= B)) || ((x <= B) && (z <= A))
                || ((y <= A) && (z <= B)) || ((y <= B) && (z <= A))) {
            System.out.println(" Кирпич пройдет ");
        } else {
            System.out.println(" Кирпич не пройдет ");
        }
    }
}