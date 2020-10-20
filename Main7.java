package by.epam.linear_program.main;

public class Main7 {
    public static void main(String[] args) {

        //1.Даны два угла треугольника (в градусах). Определить, существует ли такой
        // треугольник, и если да, то будет ли он прямоугольным.

        double degreeAlpha = 62;
        double degreeBeta = 90;
        double degreeGamma = 180 - (degreeAlpha + degreeBeta);
        if (degreeGamma > 0) {
            System.out.println(" Треугольник с углами " + degreeAlpha + " и " + degreeBeta + " существует. ");
            if (degreeAlpha == 90 || degreeBeta == 90 || degreeGamma == 90) {
                System.out.println(" Треугольник является прямоугольным. ");
            } else {
                System.out.println(" Треугольник не является прямоугольным. ");
            }
        } else {
            System.out.println(" Треугольник с углами " + degreeAlpha + " и " + degreeBeta + " не существует. ");
        }
    }
}