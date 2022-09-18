import java.util.*;
class Perfect_square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int s=(int)Math.sqrt(n);
            if(s*s==n){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}