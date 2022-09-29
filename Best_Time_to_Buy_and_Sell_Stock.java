import java.util.Scanner;
class Stock_market
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j] && (arr[j]-arr[i])>m)
                m=arr[j]-arr[i];
            }
        }
        System.out.print(m);
    }
}