import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumberA;
        double secondNumberB;
        double thirdNumberC;
        double delta;
        double x1;
        double x2;
        System.out.println("Please enter the first number");
        firstNumberA = scanner.nextDouble();
        System.out.println("Please enter the second number");
        secondNumberB = scanner.nextDouble();
        System.out.println("Please enter the third number");
        thirdNumberC = scanner.nextDouble();
        delta = ((secondNumberB * secondNumberB) - 4 * firstNumberA * thirdNumberC);
        if (firstNumberA == 0 && secondNumberB != 0 && thirdNumberC != 0) {
            System.out.println("There is only one solution to the equation: " + (thirdNumberC / secondNumberB) * -1);
        } else if (delta < 0 || (firstNumberA == 0 && secondNumberB == 0 && thirdNumberC != 0)) {
            System.out.println("There is no solution to the equation");
        } else if (firstNumberA == 0 && thirdNumberC == 0 && secondNumberB != 0) {
            System.out.println("There is only one solution to the equation: 0");
        } else if (delta==0) {
            System.out.println("There is only one solution to the equation: " + secondNumberB/(2*firstNumberA));
        } else {
            x1 = (secondNumberB - (Math.sqrt(delta)) / (2 * firstNumberA));
            x2 = (secondNumberB + (Math.sqrt(delta)) / (2 * firstNumberA));
            System.out.println("There are two solutions to the equation:" + "x1= " + x1 + " x2= " + x2);
        }

    }
}