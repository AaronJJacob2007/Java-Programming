import java.util.*;
class Practicals{
    String sent,newsent;
    Practicals(){
        sent="";
        newsent="";
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        
    }
    void arrange(){
        StringTokenizer st=new StringTokenizer(sent," ,;.!?");
        String vowels="aeiouAEIOU";
        String w;
        char ch1,ch2;
        String cons="";
        while(st.hasMoreTokens())
        {
            w=st.nextToken();
            ch1=w.charAt(0);
            ch2=w.charAt(w.length()-1);
            if(vowels.indexOf(ch1)!=-1 && vowels.indexOf(ch2)!=-1)
            newsent+=w+" ";
            else
            cons+=w+" ";
            
        }
        newsent+=cons;
    }
    void display(){
        System.out.println("Original sentence:"+sent);
        System.out.println("New sentence:"+newsent);
    }
    public static void main(){
        Practicals obj= new Practicals();
        obj.accept();
        obj.arrange();
        obj.display();
    }
    }
