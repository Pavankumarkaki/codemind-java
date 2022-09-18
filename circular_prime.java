import java.util.Scanner;
class Circular_prime
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
        int n=sc.nextInt();
        if(isprime(n)){
            int res=0;
            while(n>0){
                res=res*10+n%10;
                n/=10;
            }
            if(isprime(res)){
                System.out.print("circular prime");
            }
            else{
                System.out.print("prime but not a circular prime");
            }
        }
        else{
            System.out.print("not prime");
        }
    }
}