import java.util.*;
class Greatest_Candies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int e=sc.nextInt();
        int m=arr[0];
        for(int el:arr)
            if(el>m)
                m=el;
        for(int el:arr)
            if(el+e>=m)
                System.out.print("True"+" ");
            else
                System.out.print("False"+" ");
    }
}