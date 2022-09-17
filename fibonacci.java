import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        if(n==1)
            System.out.print(0);
        else if(n==2)
            System.out.print(a+" "+b);
        else
        {
             System.out.print(a+" "+b);
             for(int i=3;i<=n;i++){
                 int c=a+b;
                  System.out.print(" "+c);
                  a=b;
                  b=c;
             }
        }
    }
}