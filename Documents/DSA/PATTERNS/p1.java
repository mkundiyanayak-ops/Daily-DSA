import java.util.Scanner;

class p1{
    public void pattern1(int n){
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p1 p = new p1();
        int n=sc.nextInt();
        p.pattern1(n);
        
    }
}