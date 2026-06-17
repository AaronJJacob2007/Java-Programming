import java.util.Scanner;

class palindromearray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] a = new int[5];
    int[] b = new int[5];
    
    System.out.println("Enter elements of first array: ");
    for (int i = 0; i < 5; i++) {
      a[i] = input.nextInt();
    }
    
    System.out.println("Enter elements of second array: ");
    for (int i = 0; i < 5; i++) {
      b[i] = input.nextInt();
    }
    input.close();
    
    boolean isPalindrome = true;
    for (int i = 0; i < 5; i++) {
      if (a[i] != b[4 - i]) {
        isPalindrome = false;
        break;
      }
    }
    
    if (isPalindrome) {
      System.out.println("Arrays a[] and b[] are in palindrome form.");
    } else {
      System.out.println("Arrays a[] and b[] are not in palindrome form.");
    }
  }
}

