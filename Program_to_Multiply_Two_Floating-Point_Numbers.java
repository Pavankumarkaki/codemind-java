import java.util.Scanner;
class multi
{
    public static void main(String args[])
    {
        Float a,b,res;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        res=a*b;
        System.out.format("%.2f",res);
        sc.close();
    }
}