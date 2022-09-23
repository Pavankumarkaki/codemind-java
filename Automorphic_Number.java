import java.util.Scanner;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(int)Math.log10(n)+1;
        int s=n*n;
        if(n==(s%(int)Math.pow(10,d)))
        System.out.print("Automorphic Number");
        else
            System.out.print("Not an Automorphic Number");
    }
}