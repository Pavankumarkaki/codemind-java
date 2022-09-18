import java.util.Scanner;
class Rev
{
    public static int reverse(int n)
    {
        int res=0;
        while(n!=0){
            res=res*10+n%10;
            n/=10;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.print(reverse(n));
    }
}