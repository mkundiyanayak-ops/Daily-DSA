//package recurssion;
public class r3 {
    static void PrintReverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" "); //print first
        PrintReverse(n-1); //recursive
    }public static void main(String[] args) {
        int n=7;
        PrintReverse(n);
    }
}
