package chpater_02.item03;

public class KingSejongTheGreat {

    public static final KingSejongTheGreat INSTANCE = new KingSejongTheGreat();

    private KingSejongTheGreat() {}

    public void makeHangeul() {
        System.out.println("King Sejong the Great invented Hangeul.");
    }

}
