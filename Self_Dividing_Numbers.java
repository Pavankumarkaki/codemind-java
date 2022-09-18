import java.util.*;
class Self_dividing
{
    public static boolean sd(int n)
    {
        if(n==0)
            return false;
        int temp=n;
        while(temp>0){
            int r=temp%10;
            if(r==0||n%r!=0)
                return false;
            temp/=10;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(sd(i)){
                System.out.print(i+" ");
            }
        }
    }
}