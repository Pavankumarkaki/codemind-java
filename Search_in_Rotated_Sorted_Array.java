import java.util.*;
class RotatedArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int s=sc.nextInt();
        //System.out.println(s);
        for(int i=0;i<n;i++)
        {
            if(arr[i]==s)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}