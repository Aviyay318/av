import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int number;
        do {
            System.out.println("please enter positive number");
            number= scanner.nextInt();
        }while (number<0);
        for (int i=0;i<number;i++){
            for (int j=0;j<number;j++){
                if(i<number/2){
                    if ((i+j)<number/2){
                        System.out.print(" ");
                    }
                    else if ((number/2)+i<j){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                else {
                    if (number/2<i-j){
                        System.out.print(" ");
                    }
                    else if ((i+j)-1>number){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
