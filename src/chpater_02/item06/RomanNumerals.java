package chpater_02.item06;

import java.util.regex.Pattern;

public class RomanNumerals {

    static boolean isRomanNumeralSlow(String s){
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }


    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        boolean slow = false;
        boolean fast = false;
        long startSlow = System.nanoTime();
        for(int i=0; i<100; i++){

            slow = isRomanNumeralSlow("III");
        }
        long endSlow = System.nanoTime();

        long startFast = System.nanoTime();
        for(int i=0; i<100; i++){

            fast = isRomanNumeralFast("III");
        }
        long endFast = System.nanoTime();
        System.out.println("slow time = "+ (endSlow-startSlow));
        System.out.println("result = " + slow);
        System.out.println("fast time = "+ (endFast-startFast));
        System.out.println("result = " + fast);
    }
}
