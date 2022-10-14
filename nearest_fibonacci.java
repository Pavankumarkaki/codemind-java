import java.util.Scanner;
class Near_fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=a=b;
        while(c<n)
        {
            a=b;
            b=c;
            c=a+b;
        }
        if(Math.abs(c-n)==Math.abs(n-b))
            System.out.print(b+" "+c);
        else if(Math.abs(c-n)>Math.abs(n-b))
            System.out.print(b);
        else
            System.out.print(c);
    }
}