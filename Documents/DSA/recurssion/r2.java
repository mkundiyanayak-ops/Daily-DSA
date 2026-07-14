// import java.util.*;

// public class r2 {
//     static void printNumber(int n){
//         if(n==0)
//             return;
//         printNumber(n-1);
//         System.out.print(n+" ");
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n=sc.nextInt();
//         printNumber(n);
//     }
// }

import java.util.*;
class Solution {
    // Recursive function to print numbers from current to n
    public void printNumbers(int i, int n) {
        // Base case: if current exceeds n, stop recursion
        if (i > n)
            return;

        // Print current number
        System.out.print(i + " ");

        // Recursive call with next number
        printNumbers(i + 1, n);
    }
}

public class r2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.println("enter the n: ");
        int n = sc.nextInt();

        sol.printNumbers(1, n);
        System.out.println();
        sc.close();
    }
}
