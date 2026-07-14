import java.util.Scanner;

class p2 {
   public void pattern2(int n)
   {
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print(" *");
        }
        System.out.println();
    }
   } 
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    p2 p = new p2();
    int n=sc.nextInt();
    p.pattern2(n);
   }
}
