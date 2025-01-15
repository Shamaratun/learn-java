package twenty1stclass;

public class recursivePalindrome {
    private static boolean isPalindrome(String s) {
        return isPalindrome(s.toLowerCase(), 0, s.length() - 1);
    }

    private static boolean isPalindrome(String s, int low, int high) {
        if (low >= high) {
            return true;
        }
        if (s.charAt(low) != s.charAt(high)) {
            return false;
        }
        return isPalindrome(s, low + 1, high - 1);
    }

    public static void main(String[] args) {
        System.out.println("Is MOON a Palindrome? " + isPalindrome("Moon"));
    }
}
