import java.util.Scanner;
class Color
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        if(s.equals("V") || s.equals("v"))
        {
            System.out.print("Violet");
        }
        else if(s.equals("I") || s.equals("i"))
        {
            System.out.print("Indigo");
        }
        else if(s.equals("B") || s.equals("b"))
        {
            System.out.print("Blue");
        }
        else if(s.equals("G") || s.equals("g"))
        {
            System.out.print("Green");
        }
        else if(s.equals("Y") || s.equals("y"))
        {
            System.out.print("Yellow");
        }
        else if(s.equals("O") || s.equals("o"))
        {
            System.out.print("Orange");
        }
        else if(s.equals("R") || s.equals("r"))
        {
            System.out.print("Red");
        }
        else
        {
            System.out.print("-1");
        }
    }
}