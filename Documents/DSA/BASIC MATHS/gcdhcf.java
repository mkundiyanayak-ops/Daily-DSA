//greatest common divisior
//highest common factor

//brute force method.........
class gcdhcf{
    public  int  findGcd(int n1,int n2)
    {
        int gcd =1;
        for(int i=1;i<=Math.min(n1,n2);i++)
        {
            if(n1 % i ==0 && n2 % i == 0)
            {
                gcd =i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int n1=20;
        int n2=15;
        gcdhcf gh = new gcdhcf();
        int gcd =gh.findGcd(n1,n2);
        System.out.println(gcd);
    }
}