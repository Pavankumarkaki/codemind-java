import java.util.Scanner;
class Amicable_num
{
    public static int sum_div(int n)
    {
        int s=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                s+=i;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(sum_div(a)==b && sum_div(b)==a)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}