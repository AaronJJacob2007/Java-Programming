
import java.util.*;
class Capital{
    String sent;
    int freq;
    Capital(){
        sent="";
        freq=0;
    }

    void input(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a sentence ");    
        sent=in.nextLine();
        sent=sent+" ";
    }

    boolean isCap(String w){
        char ch=w.charAt(0);
        if(Character.isUpperCase(ch))
        return true;
        else
        return false;
       
       
    }

   
    void display(){
         char ch;
        int n=0;
        int c=0;
       for(int i=0;i<sent.length();i++)
        {
             ch=sent.charAt(i);
            if(ch==' ')
            {
                String w=sent.substring(n,i);
                n=i+1;
               
                if(isCap(w))
                c++;
            }
           
        }
        System.out.println("No. of words  starting with capital letter :  "+c);
      }

    public static void main(){
        Capital obj=new Capital();
        obj.input();
        obj.display();
    }
}