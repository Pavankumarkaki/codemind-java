import java.util.Scanner;
class Pretty
{
    public static boolean ispretty(int n)
    {
        int r=n%10;
        if(r==2||r==3||r==9)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            for(int j=a;j<=b;j++)
            {
                if(ispretty(j))
                    c++;
            }
            System.out.println(c);
        }
    }
}