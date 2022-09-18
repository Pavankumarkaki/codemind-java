import java.util.Scanner;
class Mega_prime
{
    public static boolean isprime(int n)
    {
        if(n==1){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n)){
            while(n>0){
                int r=n%10;
                if(isprime(r)==false){
                    System.out.print("Not Mega Prime");
                    return;
                }
                n/=10;
            }
            System.out.print("Mega Prime");
        }
        else{
            System.out.print("Not Mega Prime");
        }
    }
}