import java.util.Scanner;
class Closest_prime_diff
{
    public static boolean isprime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(isprime(n))
            System.out.print(0);
        else{
            int f=n+1,b=n-1;
            while(isprime(f)==false && isprime(b)==false)
            {
                f++;
                b--;
            }
            if(isprime(f) && isprime(b))
            {
                System.out.print(Math.min(Math.abs(f-n),Math.abs(n-b)));
            }
            else if(isprime(f))
            {
                System.out.print(f-n);
            }
            else{
                System.out.print(n-b);
            }
        }
    }
}