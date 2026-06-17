
import java.util.*;
class Repeat
{
    String str;
    int len;
    String newstr;
    Repeat()
    {
        str=" ";
        len=0;
        newstr=" ";
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        str=sc.next().toUpperCase();
        len=str.length();
    }
    void modify()
    {
        boolean flag;
        char ch;
        for(int i=0; i<len;i++)
        {
            flag=false;
            ch=str.charAt(i);
            for(int j=0;j<len;j++)
            {
                if(i!=j&&ch==str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                newstr+=""+ch;
            }
        }
    }
    void show()
    {
        System.out.println("The original word: "+str+" the modified word: "+newstr);
    }
    public static void main()
    {
        Repeat obj=new Repeat();
        obj.readword();
        obj.modify();
        obj.show();
    }
}

