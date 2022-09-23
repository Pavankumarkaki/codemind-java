import java.util.Scanner;
class  Ugly_num
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
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int c=0;
        while(n!=1)
        {
            if(n%2==0)
                n/=2;
            else if(n%3==0)
                n/=3;
            else if(n%5==0)
                n/=5;
            else 
            {
             c++;
             break;
            }
        }
        if(c==0)
            System.out.print("Ugly Number");
        else
            System.out.print("Not Ugly Number");
    }
}