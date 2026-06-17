import java.util.Scanner;
class program6singhania {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = input.nextLine();
    sentence = sentence.toUpperCase();
    int frequency = 0;
    for (int i = 0; i < sentence.length() - 1; i++) {
      if (sentence.charAt(i) == sentence.charAt(i + 1)) {
        frequency++;
      }
    }
    System.out.println("1. " + sentence);
    System.out.println("2. Frequency of double occurrence letters: " + frequency);
    int index = sentence.indexOf(".");
    if (index != -1) {
      String firstPart = sentence.substring(0, index + 1);
      String secondPart = sentence.substring(index + 1);
      System.out.println("3. " + firstPart + "\n" + secondPart);
    }
  }
}


