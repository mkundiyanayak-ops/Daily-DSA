
import java.util.*;

//reversse of an array,.........

public class r6 {
    public int[] reverseArray(int[] arr){
        int n=arr.length;
        int[] rev=new int[n];
        for(int i=0;i<n;i++){
            rev[i] = arr[n-1-i];
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size : ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elemnts : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        r6 obj = new r6();
        int[] rev = obj.reverseArray(arr);
        System.out.println("reversed array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(rev[i] + " ");

        }
    }
}





