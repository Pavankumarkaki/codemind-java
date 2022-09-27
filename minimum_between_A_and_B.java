import java.util.Scanner;
class Elements
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
        int c=0;
        int m=b;
        for(int i=0;i<n;i++)
            if(arr[i]>=a && arr[i]<=b){
                c++;
                if(arr[i]<m)
                    m=arr[i];
            }
        if(c==0)
        System.out.print(-1);
        else
        System.out.print(m);
    }
}