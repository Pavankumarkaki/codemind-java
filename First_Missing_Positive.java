import java.util.*;
class Missing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int e=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                if(arr[i]==e)
                    e++;
                else if(arr[i]>e)
                    break;
            }
        }
        System.out.println(e);
    }
}