import java.util.Scanner;
class Airport_weight
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
            arr[i]=sc.nextInt();
        int l=sc.nextInt();
        int total=0;
        for(int i=0;i<t;i++)
        {
            if(arr[i]>l)
                total+=2;
            else
                total++;
        }
        System.out.print(total);
    }
}