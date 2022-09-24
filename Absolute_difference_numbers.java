import java.util.Scanner;
class Absolute_diffNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int k=(int)Math.log10(n)+1;
        int l=n%(int)Math.pow(10,d);
        int f=n/(int)Math.pow(10,k-d);
        System.out.print((int)Math.abs(f-l));
    }
}