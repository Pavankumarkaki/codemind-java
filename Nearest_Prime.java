import java.util.Scanner;
class Nearest_prime
{
    public static boolean isprime(int n)
    {
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int f=n,b=n;
            while(isprime(f)==false){
                f++;
            }
            while(isprime(b)==false){
                b--;
            }
            int a=Math.abs(n-b);
            int c=Math.abs(f-n);
            if(a<c){
                System.out.println(b);
            }
            else if(a>c){
                System.out.println(f);
            }
            else if(a==c){
                System.out.println(Math.min(b,f));
            }
            
        }
    }
}