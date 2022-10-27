import java.util.Scanner;
class ThreeDivisors
{
    public static boolean isprime(int n)
    {
        if(n==1)
        {
            return false;
        }
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
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=(int)Math.sqrt(n);i++)
        {
            if(isprime(i))
                c++;
        }
        System.out.println(c);
    }
}