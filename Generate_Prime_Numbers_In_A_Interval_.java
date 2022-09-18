import java.util.*;
class Primes_interval
{
    public static boolean isprime(int n)
    {
        if(n==1)
            return false;
        else
        {
            for(int i=2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
            System.out.println(i);
        }
    }
}