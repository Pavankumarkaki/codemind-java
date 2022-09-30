import java.util.Scanner;
class Count_words
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []as=s.split(" ");
        System.out.print(as.length);
    }
}