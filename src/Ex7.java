import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int tempNumber;
        int sumDigits=0;
        int sumPower=1;
        int sum=0;
      for (int i=0;i<1000;i++){
          tempNumber=i;
          while (tempNumber!=0){
              tempNumber/=10;
              sumDigits++;
          }
          tempNumber=i;
          for (int j=0;j<sumDigits;j++){
              for (int z=0; z<sumDigits;z++){
                   sumPower*=tempNumber%10;
              }
              sum+=sumPower;
              tempNumber/=10;
              sumPower=1;
          }
          if(i==sum){
              System.out.println(i);
          }
          sum=0;
          sumDigits=0;
      }
    }
}
