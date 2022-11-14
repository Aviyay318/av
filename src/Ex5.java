import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int number;
        int temp1=0;
        int temp2=1;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("please enter positive number");
            number= scanner.nextInt();
        }while (number<0);
        for(int i=0;i<=number;i++){
         if(number==sum){
             System.out.println("The number"+" "+number+" "+"is in fibonacci series");
             break;
         }else if(number<sum) {
             System.out.println("The number"+" "+number+" "+"is not in fibonacci series ");
             break;
         }
         sum=temp1+temp2;
         temp1=temp2;
         temp2=sum;
        }

    }
}
