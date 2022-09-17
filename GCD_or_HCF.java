import java.util.Scanner;
class GCD
{
    public static int gcd(int a,int b)
    {
        int m=Math.min(a,b);
        while(a%m!=0 || b%m!=0)
        {
            m--;
        }
        return m;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(gcd(a,b));
    }
}