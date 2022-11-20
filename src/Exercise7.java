public class Exercise7 {
    public static void main(String[] args) {
       int tempNumber;
       int exponentByDigits;
       int powerOfDigit=1;
       int sumOfPowerOfDigits=0;
        System.out.println("The narcissistic numbers are:");
      for(int i=1;i<=1000;i++){
          tempNumber=i;
          exponentByDigits=i;
          while (tempNumber!=0){
              while (exponentByDigits>0){
              powerOfDigit*=tempNumber%10;
              exponentByDigits/=10;
           }
            sumOfPowerOfDigits+=powerOfDigit;
            powerOfDigit=1;
            exponentByDigits=i;
           tempNumber/=10;
          }
          if(i==sumOfPowerOfDigits){
          System.out.print(sumOfPowerOfDigits + " ");}
          sumOfPowerOfDigits=0;
      }
    }
}
