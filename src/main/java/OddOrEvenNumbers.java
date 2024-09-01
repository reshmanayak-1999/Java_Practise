import java.util.Scanner;

public class OddOrEvenNumbers {
    public static void main(String[] args) {
        //declaring the integer
        //int num =24;

        //Taking the input from the keyboard using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
       //Storing the entered value in variable
        int num = sc.nextInt();
        // Checking if the number is even or odd
        if(num % 2 == 0) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }
    }
}
