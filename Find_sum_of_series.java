import java.util.Scanner;
class Series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double r=0;
        for(int i=1;i<=n;i++)
        {
            r+=(double)1/i;
        }
        System.out.format("%.2f",r);
    }
}