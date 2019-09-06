import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1;
        int numRemainder = 0;
        int modulusCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an positive integer greater than 1:  ");
        num1 = input.nextInt();


        for(int i = 1; i <= num1; i++) {

            numRemainder = num1 % i;

            if (numRemainder == 0) {
                modulusCount = modulusCount + 1;
            }

        }

        if (modulusCount == 2) {
            System.out.println();
            System.out.println(num1 + " is a prime number!!!");
        }
        else {
            System.out.println();
            System.out.println(num1 + " is a not prime number...");
        }

    }

}
