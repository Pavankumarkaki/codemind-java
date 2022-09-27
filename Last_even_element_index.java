import java.util.Scanner;
class Last_even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int ind=-1;
        for(int i=0;i<n;i++)
            if(arr[i]%2==0)
                ind=i;
        System.out.print(ind);
    }
}