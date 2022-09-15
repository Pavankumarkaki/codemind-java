import java.util.Scanner;
class Can_share_equally
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int t=x+(2*y);
        if(t%2==0 && t!=0)
        {
            if(x==0 && y%2!=0)
            {
                System.out.print("NO");
            }
            else
            {
                System.out.print("YES");
            }
        }
        else
        {
            System.out.print("NO");
        }
    }
}