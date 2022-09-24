import java.util.*;
class Element_asCount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int f=0;
        for(int e:arr)
        {
            if(e!=-789)
            {
                int c=0;
                for(int i=0;i<n;i++)
                    if(arr[i]==e){
                        c++;
                        arr[i]=-789;
                    }
                if(c==e){
                    System.out.print(e+" ");
                    f=1;
                }
            }
        }
        if(f==0){
            System.out.print(-1);
        }
    }
}