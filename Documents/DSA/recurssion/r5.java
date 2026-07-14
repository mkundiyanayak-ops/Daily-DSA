//print the numbers fron n to 1 but by using the bracktracking 
import java.util.*;
public class r5 {
    static void printBracktracking(int n){
        if(n==0){
            return;
        }
        System.out.print(n  + " ");
        printBracktracking(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printBracktracking(n);
        sc.close();
    }
}
