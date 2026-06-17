import java.util.*;
class Evil
{
    int num;
    String bin;
    Evil()
    {
        num=0;
        bin="";
    }

    void acceptNum()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
    }

    void rec_bin(int x)
    {
        if(x!=0)
            bin=(x%2)+bin;
        else rec_bin(x/2);

    }

    void check()
    {  rec_bin(num);
        int len=bin.length();
        int one=0,zero=0;
        for (int i=0;i<len;i++)
        { char ch=bin.charAt(i);
            if (ch=='1')
                ++one;
            if (ch=='0')
                ++zero;
        } 
        if (one==zero)
            System.out.println("The number "+num+" is an Evil number");
        else System.out.println("The number "+num+" is an Evil number");

    }

    public static void main (String args[])
    {  
        Evil obj=new Evil();
        obj.acceptNum();
        obj.check();

    }
}
