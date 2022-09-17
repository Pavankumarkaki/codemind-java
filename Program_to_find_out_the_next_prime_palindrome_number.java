import java.util.Scanner;
class Next_palindrome
{
    public static boolean ispalin(int n)
    {
        int temp=n,res=0,r;
        while(temp>0)
        {
            r=temp%10;
            res=res*10+r;
            temp=temp/10;
        }
        if(res==n)
            return true;
        else
            return false;
    }
    public static boolean isprime(int n)
    {
        if(n==1)
            return false;
        else{
            for(int i=2;i<=(int)Math.sqrt(n)+1;i++)
                if(n%i==0)
                    return false;
            return true;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n++;
        while(isprime(n)==false || ispalin(n)==false)
        {
            n++;
        }
        System.out.println(n);
    }
}