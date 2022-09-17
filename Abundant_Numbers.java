import java.util.Scanner;
class Abundant
{
    public static boolean is_abu(int n)
    {
        int t=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                t+=i;
        }
        if(t>n)
            return true;
        return false;
    }
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(is_abu(n))
            System.out.print("True");
        else
            System.out.print("False");
        sc.close();
    }
}