public class SwappingTwoNumbers {
    public static void main(String[] args) {
        int a=100,b=300;
        System.out.println("Before swapping a is:"+a+ " and b is :" +b);
        //storing a value in temperory variable ,so temp=100
        int temp = a;
        //b value is now getting stored in variable a, so a=300
        a=b;
        //temporary variable where a value is got stored is now getting stored in variable b
        b=temp;
        System.out.println("After swapping a is:"+a+ " and b is :" +b);
    }
}
