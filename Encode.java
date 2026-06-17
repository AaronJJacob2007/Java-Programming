
import java.util.*;
class Encode
{
  String word;int len;String new_word;
  public Encode() 
  {
      word = "";
      len=0;
      new_word="";
  }

  public void acceptWord()
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the word:");
      word = sc.next();

  }

  public void nextVowel() {
      len=word.length();
      String vowel="aeiouAEIOU";
      String new_vowel="eiouaEIOUA";
      for(int i=0;i< len;i++)
      {
          char ch=word.charAt(i);
          if(vowel.indexOf(ch)!=-1)
          {
              new_word+=new_vowel.charAt(vowel.indexOf(ch));
          }
          else{
              new_word+=ch;
          }
      }
  }

  public void display()
  {

      System.out.println("Original String="+word);
      System.out.println("Encoded String="+new_word);
  }

  public static void main(String args[]) 
  {
      Encode obj = new Encode();
      obj.acceptWord();
      obj.nextVowel();
      obj.display();
  }
}