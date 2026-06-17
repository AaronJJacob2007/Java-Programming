import java.util.*;
class SwapSort
{
    String wrd, swapwrd, sortwrd; int len;
    SwapSort () {
        len=0; wrd=""; swapwrd=""; sortwrd="";
    }

    void readword (){ 
        Scanner sc = new Scanner (System. in) ;
        System.out.println("Enter a word in UPPERCASE: ");
        wrd = sc.next().toUpperCase();
        len = wrd. length();
    }

    void swapchar(){
        swapwrd =""+ wrd.charAt(len - 1) ;
        swapwrd += wrd.substring(1,len-1);
        swapwrd += wrd.charAt(0);
    }

    void sortword()
    {
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<len;j++)
            {
                char ch =wrd.charAt(j);
                if(i==ch)
                    sortwrd+=""+ch;
            }
        }
    }

    void display ()
    {
        System.out.println("Original word: "+ wrd);
        System.out.println("Swapped word: "+swapwrd);
        System.out.println("Sorted word: "+sortwrd);
    }

    public static void main()
    {
        SwapSort obj=new SwapSort();
        obj.readword();
        obj.swapchar();
        obj.sortword();
        obj.display();
    }
}
