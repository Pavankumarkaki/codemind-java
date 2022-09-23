import java.util.Scanner;
class Compound_interest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        double i=p*Math.pow(1+r/100.0,t);
        System.out.format("%.2f",i);
    }
}