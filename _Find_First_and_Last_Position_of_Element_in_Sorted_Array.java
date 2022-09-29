import java.util.Scanner;
class First_Last_position
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();
        int f=-1,l=-1,i=0,j=n-1;
        while(i<n&& j>-1)//5 7 7 8 8 10
        {
            if(arr[i]==k && f==-1)
                f=i;
            if(arr[j]==k && l==-1)
                l=j;
            i++;
            j--;
        }
        System.out.print(f+" "+l);
    }
}