import java.util.Scanner;
class Latgest_digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(int)Math.log10(n),m=0;
        while(n>0)
        {
            int r=n/(int)Math.pow(10,d);
            if(r>m)
                m=r;
            n=n%(int)Math.pow(10,d);
            d--;
        }
        System.out.print(m);
    }
}