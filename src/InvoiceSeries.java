import java.util.Scanner;

public class InvoiceSeries {
    public static void main(String[] args){
                float firstNumber;
                float distance;
                int numberOfObjects;
                Scanner scanner= new Scanner(System.in);
                System.out.println("Enter a number you want to start with ");
                firstNumber=scanner.nextFloat();
                System.out.println("Enter the distance between the following objects ");
                distance=scanner.nextFloat();
                System.out.println("Enter the amount of objects in the series ");
                numberOfObjects=scanner.nextInt();
                System.out.print("the series is: "+firstNumber+"\t");
                for (int i=0;i<numberOfObjects;i++){
                    System.out.print((firstNumber+=distance)+"\t");
                }


            }
        }


