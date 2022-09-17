import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        if(n==0 || n==1)
            System.out.print("True");
        else{
            for(int i=3;i<=n;i++){
            int c=a+b;
             if(c==n){
                 System.out.print("True");
                 return;
             }
                a=b;
                b=c;
            }
            System.out.print("False");
        }
        
    }
}