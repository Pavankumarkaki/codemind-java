import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,res=0,r;
        while(temp>0)
        {
            r=temp%10;
            res=(res*10)+r;
            temp=temp/10;
        }
        if(res==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}