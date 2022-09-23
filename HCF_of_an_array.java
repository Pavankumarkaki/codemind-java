import java.util.Scanner;
class GCD
{
    public static int gcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int h=gcd(arr[0],arr[1]);
        for(int i=2;i<n;i++)
            h=gcd(h,arr[i]);
        System.out.print(h);
    }
}