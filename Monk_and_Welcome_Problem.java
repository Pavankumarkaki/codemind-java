import java.util.Scanner;
class Arrays_sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.print((ar[i]+arr[i])+" ");
    }
}