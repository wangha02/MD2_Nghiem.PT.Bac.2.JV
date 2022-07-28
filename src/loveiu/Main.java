package loveiu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so bac 2: a= ");
        double a = scanner.nextDouble();
        System.out.println("Nhap he so bac 1: b= ");
        double b = scanner.nextDouble();
        System.out.println("Nhap he so bac 0: c= ");
        double c = scanner.nextDouble();
        QuadraticEquation ha = new QuadraticEquation(a, b, c);
        System.out.println("Delta = b^2 - 4ac ");//a + "x^2" + "+" + b + "x" + "+" + "c"
        System.out.println("Ket Qua" + ha.getDelta());


        if (ha.getDelta() < 0) {
            System.out.println("PT vo No: ");
        }else if (ha.getDelta() == 0) {
            System.out.println("PT co No kep: "+ ha.getDelta11());
        }else {
            System.out.println("PT co 2 No: x1 = "+ ha.getDelta11() + "\n" + "x2= " +ha.getDelta22());
        }

    }
}