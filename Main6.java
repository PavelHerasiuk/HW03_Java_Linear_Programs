package by.epam.linear_program.main;

public class Main6 {
    public static void main(String[] args) {
        //6. Для данной области составить линейную программу, которая печатает true,
        //  если точка с координатами (х, у) принадлежит закрашенной области, и false - в противном случае:
        int x1 = 4;
        int y1 = 1;
        if (x1 >= -2 && x1 <= 2 && y1 >= 0 && y1 <= 4) {
            System.out.println(" ----> true ");
        } else if (x1 >= -4 && x1 <= 4 && y1 >= -3 && y1 <= 0) {
            System.out.println(" ----> false ");
        } else {
            System.out.println(" ----> false ");
        }
    }
}
