import java.util.*;
class Max96
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        int revs=0,c=0;
        while(rev>0){
            int r=rev%10;
            if(r==6 && c==0){
                r=9;
                c=1;
            }
            revs=revs*10+r;
            rev/=10;
        }
        System.out.print(revs);
    }
}