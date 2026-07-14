// /*prime number is a number which has 
// two factors which is 1 and itself  */


// //brute force
// import java.util.Scanner;
// class primeNumber {
//   public boolean prime(int n)
//   {
//     int cnt = 0;

//     for(int i=1;i<=n;i++)
//     {
//       if(n % i == 0)
//       {
//         cnt++;
//       }
//     }
//     return cnt == 2 ;

//   }  
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     primeNumber p = new primeNumber();
//     boolean result=p.prime(n);
//     if(result){
//       System.out.println("primeNumber");
//     }
//     else{
//       System.out.println("not a prime number");
//     }
//   }
// }
// import java.util.Scanner;
// class primeNumber{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the number: ");
//     int n=sc.nextInt();
//     if(n <=1)
//     {
//       System.out.println("Not a palindrom");
//       return;
//     }
//     boolean isPrime = true;

//     for(int i=2;i<n;i++)
//     {
//       if(n % i ==0){
//         isPrime = false;
//         break;
//       }
//     }
//     if(isPrime)
//     {
//       System.out.println("prime Number");
//     }
//     else{
//       System.out.println("not a prime Number");
//     }
//   }
// }

//optimal approach

class primeNumber{
  public boolean checkPrime(int n)
  {
    int cnt=0;
    for(int i=1;i<=Math.sqrt(n);i++)
    {
      if(n % i == 0){
        cnt++;
        if(n/i !=1){
          cnt++;
        }
      }
    }
    return cnt ==2;
  }
  public static void main(String[] args) {
    int n=1483;
    primeNumber p = new primeNumber();
    boolean isPrime = p.checkPrime(n);
    if(isPrime){
      System.out.println("it is a prime");
    }
    else{
      System.out.println("not a prime");
    }
  }
}