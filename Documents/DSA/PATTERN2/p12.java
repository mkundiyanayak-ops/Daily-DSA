import java.util.Scanner;
public class p12 {
    public void pattern12(int n)
    {
        int space = 2* (n-1);
        for(int i=0;i<=n;i++)
        {
            //numbers
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p12 p = new p12();
        int n= sc.nextInt();
        p.pattern12(n);
    }
}
