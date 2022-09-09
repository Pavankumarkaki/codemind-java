import java.util.Scanner;
class capacity
{
    public static void main(String args[])
    {
        int t,s,b;
        long m;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        
        m=2*t*s*b*512;
        
        System.out.println(m);
        sc.close();
    }
}