//arrange word in order of length
import java.util.*;
class Practical{
    String sent;
    Practical(){
        sent="";
    }

    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
    }

    void arrange(){
        StringTokenizer st=new StringTokenizer(sent," ,;.!?");
        int len=st.countTokens();
        
        String words[]=new String[len];
        String w;
        for(int i=0;st.hasMoreTokens();i++){
            w=st.nextToken();
            words[i]=w;
            
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String t = words[j];
                    words[j] = words[j+1];
                    words[j+1] = t;
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.println(words[i]);
        }
    }
    

    void display(){
        System.out.println("Original sentence:"+sent);
        arrange();
        

    }

    public static void main(){
        Practical obj= new Practical();
        obj.accept();
        
        obj.display();
    }
}
