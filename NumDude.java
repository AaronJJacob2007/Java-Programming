
import java.util.*;
class NumDude
{
    int num;
    NumDude()
    {
        num=0;
    }

    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
    }

    int sumDigits(int x)
    {
        if (x==0)
            return 0;
        else
        {int r=x%10;
            return r+sumDigits(x/10);
        }

    }

    void isDude()
    { 
        double n=Math.pow(sumDigits(num),3);
        if (n==num)
            System.out.println("the number "+num+" is a Dudeney number");
        else System.out.println("the number "+num+" is not a Dudeney number");
    }

    public static void main (String args[])
    {  
        NumDude obj=new NumDude();
        obj.input();
        obj.isDude();

    }
}

