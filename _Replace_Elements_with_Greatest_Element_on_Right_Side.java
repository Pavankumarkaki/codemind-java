import java.util.Scanner;
class REplace_greatest_right
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            int m=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>m)
                    m=arr[j];
            }
            arr[i]=m;
        }
        arr[n-1]=-1;
        for(int e:arr)
            System.out.print(e+" ");
    }
}