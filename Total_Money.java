import java.util.Scanner;
class Money_heist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long D,d,p,Q,total;
             D=sc.nextLong();
             d=sc.nextLong();
             p=sc.nextLong();
             Q=sc.nextLong();
             total=0;
            int c=0,r=0;
            for(int j=1;j<=D;j++)
            {
                if(c==d)
                {
                    r++;
                    c=0;
                }
                total+=p+r*Q;
                c++;
                
            }
            System.out.println(total);
        }
    }
}