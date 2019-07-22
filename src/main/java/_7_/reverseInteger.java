package _7_;


public class reverseInteger {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE + 1;
        int b = reverse(a);
        System.out.println(b);

    }

    public static int reverse(int a) {
        int b = 0;
        while (a != 0) {
            b = b * 10 + a % 10;
            a /= 10;
        }
        return b > Integer.MAX_VALUE || b < Integer.MIN_VALUE ? 0 : b;
    }
}
