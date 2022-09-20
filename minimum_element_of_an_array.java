import java.util.Scanner;
class Min_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<m)
            {
                m=arr[i];
            }
        }
        System.out.print(m);
    }
}