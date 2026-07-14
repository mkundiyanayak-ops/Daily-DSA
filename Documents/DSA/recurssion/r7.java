//fibonnic series in java using recursion
import java.util.Scanner;
public class r7 {
    static int fib(int n)
    {
        if(n==0)
        return 0;
        if(n == 1)
        return 1;
     return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        System.out.println("the fibonnic series is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }
}
