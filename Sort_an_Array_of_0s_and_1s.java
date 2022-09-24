import java.util.Scanner;
class Sort_01
{
    public static void sort(int arr[])
    {
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==1 && arr[j]==0)
            {
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
            else if(arr[i]==0)
                i++;
            else
                j--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sort(arr);
        for(int e:arr)
            System.out.print(e+" ");
    }
}