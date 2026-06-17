import java.util.*;
class Special
{
     int n;
    Special()
    {
        n=0;
    }

    void read()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
    }

    int factorial(int x)
    {
        if (x >= 1)
            return x* factorial(x - 1);
        else
            return 1; 
    }

    boolean isSpecial()
    {  
        int r=0,sum=0 ,m=n;
        while(m>0)
        { 
             r=m%10;
            sum=sum+ factorial(r);
            m=m/10;
        }
        if (sum==n)
        return true;
        else return false;
        
    }
    

    void display()
    { 
        isSpecial();
        if (isSpecial()==true)
        System.out.println("The number "+n+" is a special number ");
        else System.out.println("The number "+n+" is not a special number");
    }

    public static void main (String args[])
    {  
        Special obj=new Special();
        obj.read();obj.display();

    }
}
