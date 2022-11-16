import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int numberOfDiamond;
                int numberOfAsterisks=1;
                int numberOfSpaces;
                do { System.out.println("Please enter an odd positive number grater than three: ");
                    numberOfDiamond=scanner.nextInt();
                }while (numberOfDiamond<3 || numberOfDiamond%2==0);
                numberOfSpaces=numberOfDiamond/2;
                for (int i=0;i<=(numberOfDiamond/2);i++){
                    for (int z=0;z<numberOfSpaces;z++)
                    {
                        System.out.print(" ");
                    }
                    numberOfSpaces--;
                    for(int j=0;j<numberOfAsterisks;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                    numberOfAsterisks+=2;
                }

                numberOfSpaces=1;
                numberOfAsterisks=numberOfDiamond-2;
                for (int i=0;i<(numberOfDiamond/2);i++){
                    for (int z=0;z<numberOfSpaces;z++)
                    {
                        System.out.print(" ");
                    }
                    numberOfSpaces++;
                    for(int j=0;j<numberOfAsterisks;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                    numberOfAsterisks-=2;
                }


            }
        }


