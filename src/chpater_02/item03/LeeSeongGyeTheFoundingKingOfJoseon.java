package chpater_02.item03;

/**
 * 열거 타입 방식의 싱글턴 - 바람직한 방법
 */
public enum LeeSeongGyeTheFoundingKingOfJoseon {
    INSTANCE;

    public void foundingJoseon() {
        System.out.println("Lee Seong-gye founded the Joseon Dynasty");
    }
}
