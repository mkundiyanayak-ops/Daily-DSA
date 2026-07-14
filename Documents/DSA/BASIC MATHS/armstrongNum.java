import java.util.Scanner;
//armstrong number is sum of cube is called 
 class armstrongNum {
    public boolean armstrong(int n)
    {
        int sum=0;
        int duplicate = n;

        while(n > 0)
        {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n=n/10;
        }
        return duplicate == sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n =sc.nextInt();
        armstrongNum a = new armstrongNum();
        boolean result = a.armstrong(n);
        if(result)
            {
                System.out.println("Armstrong number");
            } 
            else{
                System.out.println("not a armstrong numbeer");
            }
    }
}
