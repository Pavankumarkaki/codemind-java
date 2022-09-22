import java.util.Scanner;
class Disarium_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int d=(int)Math.log10(n);
        int temp=n,i=1;
        int s=0;
        while(temp>0)
        {
            int r=temp/(int)Math.pow(10,d);
            s+=Math.pow(r,i);
            i++;
            temp=temp%(int)Math.pow(10,d);
            d--;
        }
        if(s==n)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}