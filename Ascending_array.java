import java.util.Scanner;
class Asc_arry
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]>arr[i]){
             c++;
            }
        }
        if(c==n-1)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}