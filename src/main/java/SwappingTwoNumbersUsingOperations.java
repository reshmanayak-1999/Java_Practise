public class SwappingTwoNumbersUsingOperations {
    public static void main(String[] args) {
        int a=100,b=300;
        System.out.println("Before swapping a is:"+a+ " and b is :" +b);
        //here (a+b=100+300=400), so value 400 will be stored in variable a
        a = a+b;
        //here(a-b=where ais already stored as 400 so 400-300=100 , value 100 is stored in variable b
        b=a-b;
        //here(a-b=where a is already stored as 400 so 400-100=300 , value 300 is stored in variable a

        a=a-b;
        System.out.println("After swapping a is:"+a+ " and b is :" +b);
    }
}
