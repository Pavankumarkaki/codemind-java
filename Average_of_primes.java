import java.util.Scanner;
class Average_prime
{
    public static boolean isprime(int n)
    {
        if(n==1)
            return false;
        else{
            for(int i=2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        double avg=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(isprime(a[i])){
                avg+=a[i];
                c++;
            }
        }
        System.out.format("%.2f",avg/c);
    }
}
