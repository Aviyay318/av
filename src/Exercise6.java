import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int number;
        int tempNumber=0;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("please enter positive number");
            number= scanner.nextInt();
        }while (number<0);
        tempNumber=number;
        while (tempNumber!=0){
            if(tempNumber/10!=0){
            System.out.print(tempNumber%10+ "+");}
            else{
                System.out.print(tempNumber%10+ "=");}

            sum+=tempNumber%10;
            tempNumber/=10;

        }
        System.out.println(sum);
    }
}
