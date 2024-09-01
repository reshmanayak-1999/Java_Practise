import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int sum=0,res;
        //declaring the integer
        //int num =154;
        //Taking the input from the keyboard using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        //Storing the entered value in variable
        int num = sc.nextInt();
        //storing the num value in temporary variable
       int temp=num;
       while(num>0){
           //ex:153%10 where remainder will be 3
           res=num%10;
           //153/10 will be 15.3 so ignore .3 and take num=15
           num=num/10;
           //add sum along with the res what we got above
           sum=sum + (res*res*res);
       }
        if(temp==sum){
            System.out.println("is armstrong number");
        }else{
            System.out.println("is not an armstrong number");
        }
    }
}
