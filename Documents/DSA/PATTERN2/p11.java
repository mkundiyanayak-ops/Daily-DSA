import java.util.Scanner;
class p11{
    public void pattern11(int n)
    {
        int start =1;
        for(int i=0;i<n;i++)
        {
            if(i % 2 == 0) start =1;
            else start =0;
            for(int j =0;j<=i;j++)
            {
                System.out.print(start);
                start = 1-start;
            }
         System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        p11 p = new p11();
        p.pattern11(n);
    }
}