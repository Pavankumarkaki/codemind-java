import java.util.Scanner;
class Perfect_sq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=(int)Math.sqrt(n);
        if(s*s==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}