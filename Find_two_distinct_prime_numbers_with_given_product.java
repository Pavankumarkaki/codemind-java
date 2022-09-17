import java.util.Scanner;
class Product_prime
{
    public static boolean isprime(int n)
    {
        if(n==1)
            return false;
        else{
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
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(isprime(i) && isprime(j) &&i*j==n)
                {
                    System.out.print(i+" "+j);
                    return;
                }
            }
        }
        System.out.print(-1);
    }
}