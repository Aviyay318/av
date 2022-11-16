public class Exercise7 {
    public static void main(String[] args) {
       int tempNumber;
       int sumDigits;
       int sumPower=1;
       int sum=0;
      for(int i=1;i<=1000;i++){
          tempNumber=i;
          sumDigits=i;
          while (tempNumber!=0){
           for(int power=0;sumDigits>0;power++){
              sumPower*=tempNumber%10;
              sumDigits/=10;
           }
            sum+=sumPower;
            sumPower=1;
            sumDigits=i;
           tempNumber/=10;
          }
          if(i==sum){
          System.out.println(sum);}
          sum=0;
      }
    }
}
