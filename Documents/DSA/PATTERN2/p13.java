import java.util.Scanner;
public class p13 {
    public void pattern13(int n)
    {
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print(num + " ");
            num =  num+1;
        }
        System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        p13 p = new p13();
        p.pattern13(n);
    }
}
