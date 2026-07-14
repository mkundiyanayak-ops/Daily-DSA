import java.util.Scanner;
class p7 {
    public void pattern7(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //number of '*'
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        p7  p= new p7();
        int n=sc.nextInt();
        p.pattern7(n);
    }
}
