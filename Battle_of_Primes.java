import java.util.Scanner;
class Bahubali
{
    public static boolean isprime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=1;
        while(isprime(n1+n2+n3)==false){
            n3++;
        }
        System.out.print(n3);
    }
}