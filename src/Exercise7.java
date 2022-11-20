public class Exercise7 {
    public static void main(String[] args) {
       int tempNumber;
       int exponent;
       int sumPower=1;
       int sum=0;
      for(int i=1;i<=1000;i++){
          tempNumber=i;
          exponent=i;
          while (tempNumber!=0){
           for(int power=0;exponent>0;power++){
              sumPower*=tempNumber%10;
              exponent/=10;
           }
            sum+=sumPower;
            sumPower=1;
            exponent=i;
           tempNumber/=10;
          }
          if(i==sum){
          System.out.println(sum);}
          sum=0;
      }
    }
}
