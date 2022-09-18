import java.util.*;
class Div
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=0;
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            d++;
        }
        System.out.print(d);
    }
}