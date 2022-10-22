import java.util.*;
class Time24_12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        String ss[]=s.split(":");
        if(ss[0].equals("12") && t.equals("AM"))
        {
            System.out.println("00:"+ss[1]);
        }
        else if(ss[0].equals("12") && t.equals("PM"))
        {
            System.out.println("12:"+ss[1]);
        }
        else if(t.equals("AM"))
        {
            System.out.println(ss[0]+":"+ss[1]);
        }
        else if(t.equals("PM"))
        {
            System.out.println((Integer.parseInt(ss[0])+12)+":"+ss[1]);
        }
        
    }
}