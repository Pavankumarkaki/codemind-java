import java.util.*;
class LCM
{
    public static int lcm(int a,int b)
    {
       int m=a<b?a:b;
       while(m%a!=0 || m%b!=0)
       {
           m++;
       }
       return m;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.print(lcm(a,b));
    }
}