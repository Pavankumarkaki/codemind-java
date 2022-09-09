import java.util.Scanner;
import java.lang.Math;
class angle_btw_hands
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String time;
        time=sc.next();
        String[] times = time.split(":");
        String h=times[0];
        String m=times[1];
        int hh=Integer.parseInt(h);
        int mm=Integer.parseInt(m);
        double ang=Math.abs(30*hh-(5.5*mm));
        double angl=360-ang;
        System.out.println(Math.min(ang,angl));
    }
}