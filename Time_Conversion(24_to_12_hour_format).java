import java.util.*;
class Time24_12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ss[]=s.split(":");
        if(ss[0].equals("00"))
        {
            System.out.println("12:"+ss[1]+" "+"AM");
        }
        else if(ss[0].equals("12"))
        {
            System.out.println("12:"+ss[1]+" "+"PM");
        }
        else if(Integer.parseInt(ss[0])<12)
        {
    
            System.out.println(ss[0]+":"+ss[1]+" "+"AM");

        }
        else if(Integer.parseInt(ss[0])>12)
        {
            if(Integer.parseInt(ss[0])<22)
            System.out.println("0"+(Integer.parseInt(ss[0])-12)+":"+ss[1]+" "+"PM");
            else
            System.out.println(Integer.parseInt(ss[0])-12+":"+ss[1]+" "+"PM");
        }
    }
}