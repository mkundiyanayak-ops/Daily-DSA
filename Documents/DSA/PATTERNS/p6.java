 import java.util.Scanner;
 class p6 {
    public void pattern6(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p6 p =new p6();
        int n = sc.nextInt();
        p.pattern6(n);
    }
    
}
