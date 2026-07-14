import java.util.Scanner;
class reverse{
    public int reverseNumber(int n) {
        int rev=0;
        while(n>0)
        {
            int lastDigit = n%10;
            rev = rev * 10 + lastDigit;
            n=n/10; 
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        reverse s = new reverse();
        int reverse=s.reverseNumber(n);
        System.out.println(reverse);

    }
}