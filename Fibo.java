import java.util.*;
class Fibo
{
    int start,end;
    Fibo()
    {
        start=0;
        end=0;
    }

    void read()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a  start number");
        start=sc.nextInt();
        System.out.println("Enter a end number");
        end=sc.nextInt();
    }

    int fibo(int n)
    {
        if (n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    void display()
    { 
        for (int i=start+1;i<end;i++)
        { if(fibo(i)>end)
                break;
            System.out.println(fibo(i)+" ");
        }
    }

    public static void main (String args[])
    {  
        Fibo obj=new Fibo();
        obj.read();
        obj.display();

    }
}
