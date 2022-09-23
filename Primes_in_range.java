import java.util.Scanner;
class Primes_in_range
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
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
                c++;
        }
        System.out.print(c);
    }
}
