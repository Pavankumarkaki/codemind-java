import java.util.*;
class Triplets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        for(int i=0;i<3;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<3;i++)
            b[i]=sc.nextInt();
        int r[]={0,0};
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
                r[0]++;
            else if(a[i]<b[i])
                r[1]++;
        }
        System.out.println(r[0]+" "+r[1]);
    }
}