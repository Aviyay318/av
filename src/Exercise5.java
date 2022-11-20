import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int numberToCheck;
        int previousNumber=0;
        int followingNumber=1;
        int newFollowingNumber=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("please enter positive number");
            numberToCheck= scanner.nextInt();
        }while (numberToCheck<0);
        for(int i=0;i<=numberToCheck;i++){
         if(numberToCheck==newFollowingNumber){
             System.out.println("The number"+" "+numberToCheck+" "+"is in fibonacci series");
             break;
         }else if(numberToCheck<newFollowingNumber) {
             System.out.println("The number"+" "+numberToCheck+" "+"is not in fibonacci series ");
             break;
         }
         newFollowingNumber = previousNumber + followingNumber;
         previousNumber = followingNumber;
         followingNumber = newFollowingNumber;
        }

    }
}
