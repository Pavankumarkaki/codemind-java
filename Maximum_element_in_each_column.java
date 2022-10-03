import java.util.Scanner;
class Max_inCol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int [r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                arr[i][j]=sc.nextInt();
        for(int i=0;i<c;i++)
        {
            int max=0;
            for(int j=0;j<r;j++)
            {
                if(max<arr[j][i])
                    max=arr[j][i];
            }
            System.out.println(max);
        }
    }
}