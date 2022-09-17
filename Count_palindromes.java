import java.util.Scanner;
class Palindrome
{
    public static boolean ispalin(int n)
    {
        int temp=n,res=0,r;
        while(temp>0)
        {
            r=temp%10;
            res=res*10+r;
            temp/=10;
        }
        if(res==n)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(ispalin(arr[i]))
                c++;
        }
        System.out.print(c);
        sc.close();
    }
}