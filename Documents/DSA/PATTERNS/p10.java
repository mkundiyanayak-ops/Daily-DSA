import java.util.Scanner;

class p10 {
    public void pattern10(int n)
    {
        for(int i=0;i<2*n-1;i++)
        {
            int stars=i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p10 p = new p10();
        p.pattern10(n);
    }
}
