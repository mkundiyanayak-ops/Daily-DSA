//Brute Force Approach
import java.util.Scanner;
class coutNumbers {
    public int countDigits(int n)
    {
        int count=0;
        while(n!=0)
        {
            count = count+1;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            System.out.println("N: "+n);
            coutNumbers c=new coutNumbers();
            int digits = c.countDigits(n);
            System.out.println("number of digits : "+digits);
        }
    }
}
