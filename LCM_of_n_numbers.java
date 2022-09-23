import java.util.Scanner;
class LCM
{
    public static int lcm(int a,int b)
    {
        int m=Math.max(a,b);
        while(true)
        {
            if (m%a==0 && m%b==0)
                return m;
            m++;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int h=lcm(arr[0],arr[1]);
        for(int i=2;i<n;i++)
            h=lcm(h,arr[i]);
        System.out.print(h);
    }
}