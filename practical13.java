
import java.util.*;
public class practical13
{
    String msg,cipher;
    int len;
    practical13()
    { msg="";
     cipher="";
     len=0;
    }
    void accept()
    { Scanner sc=new Scanner (System.in);
     System.out.println("enter a Word");
     msg=sc.nextLine();
     len=msg.length();
    }
    void arrange()
    {
        char ch,ch1;
        for(int i=0;i<len;i++)
        {  ch=msg.charAt(i);
            if (!Character.isLetter(ch))
            {ch1=ch;
            }
            else if (Character.isUpperCase(ch))
            {ch1=(char)(ch+13);
                if(ch1>90)
                ch1=(char)(ch1-26);
            }else  
            {ch1=(char)(ch+13);
                if(ch1>122)
                ch1=(char)(ch1-26);
            }
            cipher+=ch1;
            }
           
            }
        void display()
    {
        System.out.println("Original sentence: "+msg);
        System.out.println("Rearranged sentence: "+cipher);
    }
    public static void main(String args[])
    { practical13 obj=new practical13();
      obj.accept();
      obj.arrange();
      obj.display();
    }
       
}
