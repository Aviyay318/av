import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfPrimeNumber;
        int firstNumberToCheck=3; //  The second number is the series.
        int sumOfPrimeNumber=1;
        int checkPrimeNumber=0;
        do{
            System.out.println("How much prime numbers you want to see? Enter a number positive and grater than-0");
            amountOfPrimeNumber= scanner.nextInt();
        }while(amountOfPrimeNumber<=0);
        System.out.println(2);
        while(amountOfPrimeNumber!=sumOfPrimeNumber){
            for(int i=2;i<firstNumberToCheck;i++){ // The number one is not a prime number.
                if(firstNumberToCheck%i==0){
                    checkPrimeNumber=1;
                    break;
                }
            }
            if(checkPrimeNumber==0){
                System.out.println(firstNumberToCheck);
                sumOfPrimeNumber++;
            }
            else {
                checkPrimeNumber=0;
            }
            firstNumberToCheck+=2; // An even number is never a prime number.
        }
    }
}
