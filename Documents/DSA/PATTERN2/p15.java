import java.util.Scanner;

public class p15 {
    public void pattern15(int n)
    {
        for(int i=0;i<n;i++)
            {
                for(char ch ='A';ch <= 'A' + (n-i-1);ch++)
                {
                    System.out.print(ch+" ");
                }
                System.out.println();
            }  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p15 p = new p15();
        p.pattern15(n);
    }
}

