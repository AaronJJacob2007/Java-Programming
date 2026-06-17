import java.util.Scanner;

class SentenceProcessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Convert sentence to uppercase
        sentence = sentence.toUpperCase();
        System.out.println("1. " + sentence);

        // Count frequency of double occurrence characters
        int doubleOccurrenceCount = 0;
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == sentence.charAt(i + 1)) {
                doubleOccurrenceCount++;
            }
        }
        System.out.println("2. Frequency of double occurrence letters: " + doubleOccurrenceCount);

        // Split sentence in two lines when it locates a full stop
        int index = sentence.indexOf(".");
        if (index != -1) {
            System.out.println("3. " + sentence.substring(0, index + 1));
            System.out.println(sentence.substring(index + 1));
        }
    }
}
