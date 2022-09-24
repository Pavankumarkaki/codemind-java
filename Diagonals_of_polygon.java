import java.util.Scanner;
class Diagonals_polygon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=n*(n-3)/2;
        System.out.print(d);
    }
}