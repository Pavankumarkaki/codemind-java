import java.util.Scanner;
class Fahrenheit_celsius
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int f=sc.nextInt();
        double c=(f-32)*(5/9.0);
        System.out.format("%.2f",c);
    }
}