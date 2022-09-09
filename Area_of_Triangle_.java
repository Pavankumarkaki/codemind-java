import java.util.Scanner;
import java.lang.Math;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double s=(float)(a+b+c)/2.0;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
        sc.close();
    }
}