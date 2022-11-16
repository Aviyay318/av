import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int NumberOfDiamond;
                int NumberOfAsterisks=1;
                int NumberOfSpaces;
                do { System.out.println("Please enter an odd positive number grater than three: ");
                    NumberOfDiamond=scanner.nextInt();
                }while (NumberOfDiamond<3 || NumberOfDiamond%2==0);
                NumberOfSpaces=NumberOfDiamond/2;
                for (int i=0;i<=(NumberOfDiamond/2);i++){
                    for (int z=0;z<NumberOfSpaces;z++)
                    {
                        System.out.print(" ");
                    }
                    NumberOfSpaces--;
                    for(int j=0;j<NumberOfAsterisks;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                    NumberOfAsterisks+=2;
                }

                NumberOfSpaces=1;
                NumberOfAsterisks=NumberOfDiamond-2;
                for (int i=0;i<(NumberOfDiamond/2);i++){
                    for (int z=0;z<NumberOfSpaces;z++)
                    {
                        System.out.print(" ");
                    }
                    NumberOfSpaces++;
                    for(int j=0;j<NumberOfAsterisks;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                    NumberOfAsterisks-=2;
                }


            }
        }


