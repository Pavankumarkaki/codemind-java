import java.util.Scanner;
class FancyNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()>10 || s.length()<10)
        {
            System.out.println(-1);
            return;
        }
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
            arr[i]=(int)s.charAt(i)-48;
        int c1=0,c2=0,c3=0;
        for(int i=0;i<8;i++)
        {
            if(arr[i]==arr[i+1] && arr[i]==arr[i+2])
            {
                c1=1;
            }
            if((arr[i]==arr[i+1]-1 && arr[i]==arr[i+2]-2) ||(arr[i]==arr[i+1]+1 && arr[i]==arr[i+2]+2))
            {
                c2=1;
            }
            if(c1==1 && c2==1)
            {
                break;
            }
        }
        for(int i=0;i<10;i++)
        {
            int c=0;
            for(int j=0;j<10;j++)
            {
                if(arr[i]==arr[j])
                c++;
            }
            if(c>=5)
            {
                c3=1;
                break;
            }
        }
        if(c1+c2+c3>0)
        {
            System.out.println("FANCY NUMBER");
        }
        else
        {
            System.out.println("NOT A FANCY NUMBER");
        }
    }
}