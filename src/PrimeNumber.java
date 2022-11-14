import java.util.Scanner;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfPrimeNumber,number=3,x=1;
        int checkPrimeNumber=0;
        do{
            System.out.println("please enter positive number");
            amountOfPrimeNumber= scanner.nextInt();
        }while(amountOfPrimeNumber<=0);
        System.out.println("2");
        while(amountOfPrimeNumber!=x){
            for(int i=2;i<number;i++){
                if(number%i==0){
                    checkPrimeNumber=1;
                    break;
                }
            }
            if(checkPrimeNumber==0){
                System.out.println(number);
                x++;
            }
            else {
                checkPrimeNumber=0;
            }
            number+=2;
        }
    }
}
