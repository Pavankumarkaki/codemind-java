import java.util.Scanner;
class Cars
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();
        int a=x,b=0,c=0;
        if(n2>n1)
        {
            while(a>=b)
            {
                a+=n1;
                b+=n2;
                c++;
            }
            System.out.println(c);
        }
        else
            System.out.print(-1);
        
    }
}