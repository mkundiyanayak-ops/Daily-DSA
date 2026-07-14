//print linearly from i to n but by bracktracking..
import java.util.*;
class r4 {
    static void printB(int n){
        if(n==0){
            return;
        }
        printB(n-1);//recrsive call
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            printB(n);
            sc.close(); 
        }
    }
}
