import java.util.*;
 class VowelRep
{
 public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word: ");
        String str = in.nextLine();
        str = str.toLowerCase();
        String str2 = "";
       for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        if (str.charAt(i) == 'a'||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
                char nextChar = (char)(ch + 1);
                 str2 = str2+  nextChar;}
            else {
                 str2 = str2 + ch;
            }
        }System.out.println(str2);
    }
}
