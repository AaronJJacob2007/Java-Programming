
import java.util.*;
import java.lang.*;
class Gcd
{  int num1,num2;

    Gcd()
    {
        num1=0;
        num2=0;
    }

    void accept()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the second number");
        num2=sc.nextInt();
    }

    int gcd(int x,int y)
    { 
        if (x==0)
            return y;
        return gcd(y%x,x);

    }

    void display()
    {  
        System.out.println("The GCD of "+num1+" and "+num2+" is: "+gcd(num1,num2));

    }

    public static void main (String args[])
    {   
        Gcd obj=new Gcd();
        obj.accept();

        obj.display();

    }
}

