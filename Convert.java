import java.util.*;
class Convert
{
    int n,d,m,y;
    Convert()
    {
        n=0;
        d=0;
        m=0;
        y=0;
    }

    void accept()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the day number");
        n=sc.nextInt();
        System.out.println("Enter the year");
        y=sc.nextInt();
    }

    void day_to_date()
    {  
        int a[]={31,29,31,30,31,30,31,31,30,31,30,31};
        if (y%4==0)
            a[2]=29;
        int s=0,c=0;
        while(s<n)
            s=s+a[c++];

        s=s-a[--c];
        d=n-s;
        m=c;
    }

    void display()
    {
        String months[]={ "January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("\n Day Number:"+n);
        System.out.println("\n Date:"+n);
        System.out.println(months[m]+""+d+","+y);
    }

    public static void main (String args[])
    {  
        Convert obj=new Convert();
        obj.accept();
        obj.day_to_date();
        obj.display();
    }
}
