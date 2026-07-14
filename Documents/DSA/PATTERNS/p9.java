import java.util.Scanner;
public class p9 {
    public void pattern7(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pattern8(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i +1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
             System.out.println();
 
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        p9 p = new p9();
        p.pattern7(n);
        p.pattern8(n);
    }

}
