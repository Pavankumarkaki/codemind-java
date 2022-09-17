import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
            System.out.print("not a prime");
        else{
            for(int i=2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    System.out.print("not a prime");
                    return;
                }
            }
            System.out.print("prime");
        }
    }
}