package chpater_02.item04;

public class UtilityClass {

    //기본 생성자가 만들어지는 것을 막는다.

    private UtilityClass() {
        throw new AssertionError();
    }

    public static String hello() {
        return "hello";
    }
}
