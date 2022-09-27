import java.util.Scanner;
class Sum_not_btw
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0;
        for(int i=0;i<n;i++)
            if(arr[i]<a || arr[i]>b)
                s+=arr[i];
        System.out.print(s);   
    }
}