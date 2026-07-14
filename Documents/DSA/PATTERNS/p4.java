import java.util.Scanner;

class p4 {
    public void pattern4(int n)
    {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        p4 p =new p4();
        p.pattern4(n);
    }
}
