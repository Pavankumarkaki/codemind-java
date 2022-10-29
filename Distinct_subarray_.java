import java.util.Scanner;
class OddSubarray
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            int s=0;
            for(int j=i;j<=b;j++)
            {
                s+=j;
                if(s%2!=0)
                    c++;
            }
        }
        System.out.println(c);
    }
}