import java.util.*;
public class r1 {
    static void printName(String name,int n){
        if(n==0)
        {
            return;
        }
        System.out.println(name);
        printName(name,n-1);//recrsive call
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name:");
        String name=sc.nextLine();
        System.out.println("enter number of times: ");
        int n=sc.nextInt();
        printName(name,n); //method call
    }
}
