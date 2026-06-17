import java.util.*;
  class Rearrange{
    String wrd;
    String newwrd;
    Rearrange(){
        wrd="";
        newwrd="";
    }

    void readword(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a word in uppercase....");
        wrd=in.nextLine();
    }

    void freq_vow_con(){
        int vfreq=0;
        int cfreq=0;
        char ch;
        for(int i=0;i<wrd.length();i++)
        {
            ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vfreq++;}
            else
                cfreq++;
        }
        System.out.println("Vowels"+vfreq);  
        System.out.println("Consonants"+cfreq);  
    }

    void arrange(){
        String v="";
        String c="";
        char cha;
       
        for(int i=0;i<wrd.length();i++)
        {
            cha=wrd.charAt(i);
            if(cha=='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U'){
                v=v+wrd.charAt(i);
            }
            else
                c=c+wrd.charAt(i);
        }
        newwrd=v.concat(c);
    }

    void display(){
        System.out.println("The original word:"+wrd);
        System.out.println("The rearranged word:"+newwrd);
     
    }
    public static void main(){
         Rearrange obj=new Rearrange();
         obj.readword();
         obj.freq_vow_con();
         obj.arrange();
         obj.display();
    }
}
