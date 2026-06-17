import java.util.*;
class BinSearch
{  int arr [];
    int n;
    BinSearch(int nn)
    {n=nn;
        arr= new int [n];
    }

    void fillarray()
    {
        Scanner sc=new Scanner (System.in);
        for (int i=0;i<n;i++)
        {System.out.println("Enter data for Array["+i+"]");
            arr[i]=sc.nextInt();
        }
    }

    void sort()
    {
        for(int i=0;i<n-1;i++)
        {//loop to access each array element ,no of passes
            for(int j=0;j< n-1-i;j++)
            {//loopto compare array elements
                if (arr[j]>arr[j+1])
                {int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    int bin_search(int l,int u,int v)
    {
       if (u>=l)
       {int mid =l+(u-l)/2;
           
           if (arr[mid]==v)
           return mid;
           
           if (arr[mid]>v)
            return bin_search(l,mid-1,v);
            else return bin_search (mid+1,u,v);
        }
        return -1;

    }

    public static void main (String args[])
    {  BinSearch obj=new BinSearch(10);
        obj.fillarray();
        obj.sort();
        int ans=obj.bin_search(0,9,4);
        if (ans==-1)
        System.out.println("the number was not found");
        else System.out.println("the number was found at:"+ans);
    }
}
