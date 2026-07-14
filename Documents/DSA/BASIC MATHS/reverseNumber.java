import java.util.Scanner;

 class reverseNumber {
    public int reverse(int n)
    {
        int revNum=0;
        while(n>0)
        {
            int lastDigit = n%10;
            revNum = (revNum *10) + lastDigit;
            n=n/10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the numbeer : ");
        int n= sc.nextInt();
        reverseNumber r = new reverseNumber();
        int reverse =r.reverse(n);
        System.out.println("the reverse number is: "+reverse);

    }
}

