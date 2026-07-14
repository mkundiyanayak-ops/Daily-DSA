import java.util.*;
class count{
    public int countDigit(int n) {
        int cnt=0;
        while(n>0){
            cnt = cnt+1;
            n=n/10;
        }
        return cnt;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n=sc.nextInt();
        count s = new count();
        int result = s.countDigit(n);
        System.out.println(result);
    }
}