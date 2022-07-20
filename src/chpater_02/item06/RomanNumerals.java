package chpater_02.item06;

import java.util.regex.Pattern;

public class RomanNumerals {

    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }


    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }

    private static long sum1() {
        Long sum = 0L;
        long start = System.nanoTime();
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        long end = System.nanoTime();
        return end-start;
    }

    private static long sum2() {
        long sum = 0L;
        long start = System.nanoTime();
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        long end = System.nanoTime();
        return end-start;
    }


    public static void main(String[] args) {
        boolean slow = false;
        boolean fast = false;
        long startSlow = System.nanoTime();
        for (int i = 0; i < 100; i++) {

            slow = isRomanNumeralSlow("III");
        }
        long endSlow = System.nanoTime();

        long startFast = System.nanoTime();
        for (int i = 0; i < 100; i++) {

            fast = isRomanNumeralFast("III");
        }
        long endFast = System.nanoTime();
        System.out.println("slow time = " + (endSlow - startSlow));
        System.out.println("result = " + slow);
        System.out.println("fast time = " + (endFast - startFast));
        System.out.println("result = " + fast);

        long sum1 = sum1();
        System.out.println("sum1 speed = " + sum1);

        long sum2 = sum1();
        System.out.println("sum2 speed= " + sum2);

        System.out.println("(sum1-sum2) = " + (sum1-sum2));
    }
}
