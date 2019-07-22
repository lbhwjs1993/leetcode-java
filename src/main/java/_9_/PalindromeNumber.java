package _9_;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean flag = palindromeNumber(110);
        System.out.println(flag);
    }

    public static boolean palindromeNumber(int a) {
        if (a < 0)
            return false;
        if (a == 0)
            return true;
        int b = 0;
        int c = a;
        while (a > 0) {
            b = b * 10 + a % 10;
            a /= 10;
        }
        if (c == b)
            return true;
        return false;
    }
}
