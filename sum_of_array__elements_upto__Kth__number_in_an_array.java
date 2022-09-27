import java.util.Scanner;
class Sum_array_K
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();
        int s=0;
        for(int i=0;i<k;i++)
            s+=arr[i];
        System.out.print(s);
    }
}