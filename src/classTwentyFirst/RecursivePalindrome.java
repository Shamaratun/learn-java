package classTwentyFirst;

public class RecursivePalindrome {
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length()-1);
    }
    private static boolean isPalindrome(String s, int low, int high) {
        if (s.length() <= 1) // Base case
            return true;
        if(low>=high)
            return true;
        else if (s.charAt(low) != s.charAt(high)) // Base case
             return false;
        else
         return isPalindrome(s, low + 1, high - 1);
         }

         public static void main(String[] args) {
         System.out.println("Is moon a palindrome? "
                 + isPalindrome("moon"));
              System.out.println("Is noon a palindrome? "
                      + isPalindrome("noon"));
              System.out.println("Is a a palindrome? " + isPalindrome("a"));
              System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
              System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
             }
 }
