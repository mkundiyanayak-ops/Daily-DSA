import java.util.Scanner;
class p5 {
    public void pattern5(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        p5 p =new p5();
        int n=sc.nextInt();
        p.pattern5(n);
    }
}
