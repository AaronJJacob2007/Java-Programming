
import java.util.*;
class ArmNum
{
    int n,l;
    ArmNum(int nn)
    {
        n=nn;
        l=0;
    }

    int sum_pow(int i)
    {   

        if (i==0)
            return 0;
        else
        {int r=i%10;
            return (int)Math.pow(r,l)+sum_pow(i/10);
        }

    }

    void isArmstrong()
    {
        int m=n;
        while (m>0)
        {
            l++;
            m=m/10;
        }
        int num=sum_pow(n);

        if (n==num)
            System.out.println("the number "+n+" is an Armstrong number");
        else System.out.println("the number "+n+" is not an Armstrong number");
    }

    public static void main (String args[])
    {  
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        ArmNum obj=new ArmNum(num);
        obj.isArmstrong();

    }
}
