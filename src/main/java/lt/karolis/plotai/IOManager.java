package lt.karolis.plotai;

import java.util.Scanner;

public class IOManager {
    private static double figureType;
    private static double side1;
    private static double side2;

    public double getFigureType() {
        return figureType;
    }

    public void setFigureType(int figureType) {
        this.figureType = figureType;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    static Scanner sc = new Scanner(System.in);

    public static void whatFigure() {
        System.out.println("Pasirinkite figura:" );
        System.out.println("1. Kvadratas" );
        System.out.println("2. Trikampis" );
        System.out.println("3. Apskritimas" );
        figureType = sc.nextInt();
    }

    public static void whatSide() {
        switch ((int) figureType) {
            case 1 -> {
                System.out.println("Iveskite krastines ilgi" );
                side1 = sc.nextDouble();
                Square k = new Square((int) side1);
                System.out.println(k);
            }
            case 2 -> {
                System.out.println("Iveskite pirmo statinio ilgi" );
                side1 = sc.nextDouble();
                System.out.println("Iveskite antro statinio ilgi" );
                side2 = sc.nextDouble();
                Triangle t = new Triangle((int) side1, (int) side2);
                System.out.println(t);
            }
            case 3 -> {
                System.out.println("Iveskite spindulio ilgi" );
                side1 = sc.nextDouble();
                Round r = new Round((int) side1);
                System.out.println(r);
            }
        }
    }
}
