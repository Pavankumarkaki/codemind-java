import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
        System.out.print(0);
        else if(n==2)
        System.out.print(0+" "+1);
        else{
            int a=0,b=1,c,i=3;
            System.out.print(0+" "+1+" ");
            while(i<=n)
            {
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
                i++;
            }
        }
    }
}