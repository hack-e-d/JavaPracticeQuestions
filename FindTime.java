import java.util.Scanner;

/*
Question 3
Write a java program to convert the degree of hour on the clock to time with hour:minute format.
     -Input degree=0      => Output time=00:00
     -Input degree=360    => Output time=12:00
     -Input degree=90     => Output time=03:00
     -Input degree=45     => Output time=01:30
     -Input degree=250    => Output time=08:20

The degree value must be valid 0-360
 */
public class FindTime {
    public static void  main(String s[]) {
        int hourAngle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour hand angle : ");
        hourAngle = sc.nextInt();
        while(hourAngle < 0 || hourAngle > 360) {
            System.out.println("Angle can only be within the range of 0 - 360,Enter angle again :");
            hourAngle = sc.nextInt();
        }
        System.out.println("Time = " + findTime(hourAngle));
    }

    public static String findTime(int hourAngle) {
        String time = "";
        int hours = hourAngle / 30;
        int mins = hourAngle % 30;
        mins *= 2;

        time = ((hours < 10) ? "0" : "" )+ String.valueOf(hours) + " : ";
        time += (mins < 1) ? "0" : "";
        time += (mins < 10) ? "0" : "" + String.valueOf(mins);
        return time;
    }

}
