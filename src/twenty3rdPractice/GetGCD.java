package twenty3rdPractice;

public class GetGCD {
    public static void main(String[] args) {
        int num = 8, num2 = 64;
        int re = getGCD(num, num2);
        System.out.println(re);
    }

    private static int getGCD(int num, int num2) {
        if (num == 0) {
            return num2;

        } else {
            return getGCD(num2 % num, num);
        }
    }
}
