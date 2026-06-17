
import java.util.*;
class Mix
{
    String wrd;
    int len;

    Mix()
    {
        wrd="";
        len=0;
    }

    void Feedword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        wrd=sc.nextLine();
        len=wrd.length();
    }

    void mix_word(Mix P,Mix Q)
    {
        int small=Math.min(P.len,Q.len);
        for(int i=0;i<small;i++)
        {
             wrd+=""+P.wrd.charAt(i)+Q.wrd.charAt(i);
             
        }
        if(P.len>Q.len)
        wrd+=P.wrd.substring(small);
        else
        wrd+=Q.wrd.substring(small);
    }

    void display()
    {
       System.out.println("The mix word: "+wrd);
    }

    public static void main()
    {
       Mix obj1=new Mix();
       obj1.Feedword();
       Mix obj2=new Mix();
       obj2.Feedword();
       Mix ans=new Mix();
       ans.mix_word(obj1,obj2);
       ans.display();
    }
}

