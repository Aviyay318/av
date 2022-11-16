import java.util.Scanner;

public class InvoiceSeries {
    public static void main(String[] args) {
        float firstNumber;
        float distance;
        float numberOfObjects;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number you want to start with ");
        firstNumber=scanner.nextFloat();
        System.out.println("Enter the distance between the following objects ");
        distance=scanner.nextFloat();
        do{
            System.out.println("Enter the amount of objects in the series ");
            numberOfObjects=scanner.nextFloat();
        }while(numberOfObjects<0||numberOfObjects%1!=0);
        System.out.print("the series is: "+"("+firstNumber+")"+"\t");
        for (int i=1;i<numberOfObjects;i++){
            System.out.print("("+(firstNumber+=distance)+")"+"\t");
        }


    }}

