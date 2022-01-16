public class palindromeNumbers {

    public static boolean isPalindrome(int x) {
        int number = x;
        if (x == 0)
            return true;

        if (x < 0 || x % 10 == 0)
            return false;

        int reverse = 0;
        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }

        if (number == reverse)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
