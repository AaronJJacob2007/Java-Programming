import java.util.*;
public class Goldbach
{
    int n;
    Goldbach()
    {
        n=0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n<1||n>50||n%2!=0){
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }

    boolean Prime(int u)
    {
        for(int i=2;i<u;i++)
        {
            if(u%i==0)
            {
                return false;
            }
        }
        return true;
    }

    void Check()
    {
        int i,j;
        System.out.println("The combination are:");
        for(i=3;i<=n/2;i++)
        {
            for(j=3;j<=n;j++)
            {
                if(Prime(i)&&Prime(j))
                {
                    if(i+j==n)
                        System.out.println(i+","+j);
                }
            }
        }

    }

    public static void main()
    {
        Goldbach obj=new Goldbach();
        obj.input();
        obj.Check();
    }
}