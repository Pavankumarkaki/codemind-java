import java.util.Scanner;
class Neon_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*n;
        int sum=0;
        while(s>0){
            sum+=(s%10);
            s/=10;
        }
        if(sum==n){
            System.out.print("Neon Number");
        }
        else{
            System.out.print("Not Neon Number");
        }
    }
}