import java.util.Scanner;
class Celsius_faherenheit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int c=sc.nextInt();
        double f=(9/5.0)*c+32;
        System.out.format("%.2f",f);
    }
}