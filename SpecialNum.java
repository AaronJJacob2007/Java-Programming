import java.util.Scanner;

 class SpecialNum
{
     static int fact(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        return b;
    }
 static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = in.nextInt();

        int c = no;
        int sum = 0;
        while (c != 0) {
            int d = c % 10;
            sum += fact(d);
            c/= 10;
        }

        if (sum == no)
            System.out.println(no + " is a special number");
        else
            System.out.println(no + " is not a special number");
}
}
