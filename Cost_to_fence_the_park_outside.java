import java.util.Scanner;
class Cost_outside_fence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int l,b,w,c;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        l+=w;
        b+=w;
        int p=2*(l+b);
        System.out.print(c*w*p);
    }
}