import java.util.Scanner;
class Strong_number
{
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*(fact(n-1));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,t=n;
        while(t>0){
            int r=t%10;
            sum+=fact(r);
            t/=10;
        }
        if(sum==n){
            System.out.format("The number %d is a strong number",n);
        }
        else{
            System.out.format("The number %d is not a strong number",n);
        }
    }
}