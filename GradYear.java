import java.util.*;
 class GradYear
{
    public static void main() {
        Scanner in = new Scanner(System.in);
        int y[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
        System.out.print("Enter graduation year : ");
        int year = in.nextInt();
        int top = 0, bottom = y.length - 1, pos = -1;
        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (y[mid] == year) {
                pos= mid;
                break;
            }
            else if (y[mid] < year) {
                top = mid + 1;
            }
            else {
                bottom = mid - 1;
            }
        }
        if (pos == -1)
            System.out.println("Record does not exist");
        else
            System.out.println("Record exists");
    }
}
