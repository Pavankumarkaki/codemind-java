import java.util.Scanner;
class Palindrome
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
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            if(ispalin(sc.nextInt())){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}