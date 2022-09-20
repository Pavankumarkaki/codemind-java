import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        double avg=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            avg+=arr[i];
        }
        System.out.format("%.2f",avg/n);
    }
}