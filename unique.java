import java.util.*;
class Unique
{
    int m,n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for m");
        m=sc.nextInt();
        System.out.println("Enter a value for n");
        n=sc.nextInt();
        if(m>n||m<0||n<0||m>30000||n>30000)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }

    boolean checkUnique(int x)
    {
        int d;
        int arr[]=new int[10];
        while(x>0)
        {
            d=x%10;
            x=x/10;
            arr[d]++;
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]>1)
                return false;
        }
        return true;
    }

    public static void main()
    {
        Unique obj=new Unique();
        obj.input();
        int freq=0;
        System.out.print("THE UNIQUE NUMBER ARE: ");
        for(int i=obj.m;i<=obj.n;i++)
        {
            if(obj.checkUnique(i))
            {
                System.out.print(i+" , ");
                freq++;
            }
        }
        if(freq==0)
            System.out.print("NIL");
        System.out.println("\nFREQUENCY OF UNIQUE DIGIT INTEGER "+freq);
    }
}