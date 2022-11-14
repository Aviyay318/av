import java.util.Scanner;

public class QuadraticEquation {
    public  static void main(String[] args) {
        double x1, x2,sum = 0;
        double valuesOf[] = new double[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("please enter a number");
            valuesOf[i] = scanner.nextInt();
        }
        if (valuesOf[0] == 0) {
            x1 = valuesOf[2] / valuesOf[1];
            System.out.println("There is only one solution to the eqution:" + x1*-1);
        } else if (valuesOf[1]==0&&valuesOf[2]==0) {
            System.out.println("There are only one solution to the eqution: 0");

        }
        else if ((valuesOf[1] * valuesOf[1]) - 4 * valuesOf[0] * valuesOf[2]==0){
            System.out.println("There are only one solution to the eqution:" + valuesOf[1]/(2*valuesOf[0]));
        }
         else if ((valuesOf[1] * valuesOf[1]) - 4 * valuesOf[0] * valuesOf[2] < 0) {
            System.out.println("There is no solution to the eqution");
        } else {
            sum = ((valuesOf[1]) - 4 * valuesOf[0] * valuesOf[2]);
                x1 = (valuesOf[1] + Math.sqrt(sum))/(2 * valuesOf[0]);
                x2 = (valuesOf[1] - Math.sqrt(sum))/(2 * valuesOf[0]);
                System.out.println("There are two solutions to the eqution:" + "x1=" + x1 +" "+ "x2=" + x2);

        }

    }}
