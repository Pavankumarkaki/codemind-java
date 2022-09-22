import java.util.Scanner;
class Simple_interest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int i=(p*t*r)/100;
        System.out.print(i);
    }
}