// import java.util.*;
// class palindrom {
//     public boolean palind(int n)
//     {
//         int rev=0;
//         int duplicate=n;
//         while(n>0)
//         {
//             int id = n % 10;
//             rev=(rev *10)+id;
//             n=n/10; 
//         }
//         return duplicate == rev;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         palindrom p = new palindrom();
//         boolean result=p.palind(n);
//         System.out.println(result);
//     }
// }

import java.util.Scanner;

class palindrom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n =sc.nextInt();

        int original=n;
        int rev=0;

        while(n>0)
        {
            int digit = n % 10;
            rev = rev *10 + digit;
            n= n/10;
        }
        if(original == rev)
        {
            System.out.println("palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}