import java.util.Scanner;
class Closest_palindrome
{
    public static boolean ispal(int n)
    {
        int d=(int)Math.log10(n);
        int r1,r2;
        while(n>0)
        {
            r1=n/(int)Math.pow(10,d);
            r2=n%10;
            if(r1!=r2)
                return false;
            n=n%(int)Math.pow(10,d);
            n=n/10;
            d-=2;
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        //System.out.print(n);
        int f=n+1,b=n-1;
        while(!ispal(f)&&!ispal(b))
        {
            f++;
            b--;
        }
        if(ispal(f) && ispal(b))
        {
            System.out.format("%d %d",b,f);
        }
        else if(ispal(f))
        {
            System.out.print(f);
        }
        else{
            System.out.print(b);
        }
    }
}