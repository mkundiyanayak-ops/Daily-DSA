/*divisiors means a number given in that what tables are 
been dividing that number
ex:- 36
1,2,3,4,6,9,12,18,36
*/
import java.util.Scanner;
class printAllDivisors {
    public void printdivisiors(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n= sc.nextInt();
        printAllDivisors p = new printAllDivisors();
        p.printdivisiors(n);
       
    }
}
