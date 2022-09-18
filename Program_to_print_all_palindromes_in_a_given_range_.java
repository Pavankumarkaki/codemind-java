import java.util.Scanner;
class Palin_range
{
    public static boolean ispalin(int n)
    {
        int temp=n,res=0;
        while(temp>0){
            res=res*10+temp%10;
            temp/=10;
        }
        if(res==n){
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(ispalin(i)){
                System.out.print(i+" ");
            }
        }
    }
}