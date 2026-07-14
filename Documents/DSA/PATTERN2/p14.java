import java.util.Scanner;
class p14 {
    public void pattern14(int n)
    {
        for(int i=0;i<n;i++)
        {
              for(char ch = 'A'; ch <= 'A' +i;ch++)
              {
                System.out.print(ch + " ");
              }
              System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p14 p = new p14();
        p.pattern14(n);
    }
}
