import java.util.Scanner;
class p8 {
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
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        p8 p = new p8();
        p.pattern8(n);
    }
}
