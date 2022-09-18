import java.util.*;
class ADD
{
    public static int add(int n)
    {
        if(n<10)
            return n;
        int s=0;
        while(n>0)
        {
            s+=n%10;
            n/=10;
        }
        return add(s);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(add(n));
    }
}