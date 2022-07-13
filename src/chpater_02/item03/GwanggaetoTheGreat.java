package chpater_02.item03;

/**
 * 정적 팩터리 방식의 싱글턴
 */
public class GwanggaetoTheGreat {
    private static final GwanggaetoTheGreat INSTANCE = new GwanggaetoTheGreat();
    private GwanggaetoTheGreat(){}
    public static GwanggaetoTheGreat getInstance(){return INSTANCE;}

    public void buildGreatEmpire(){
        System.out.println("King Gwanggaeto the Great built a great empire");
    }

    private Object readResolve() {
        // '진짜' 인스턴스를 반환하고 , 가짜 인스턴스를 가비지 컬렉터에 맡긴다.
        return INSTANCE;
    }
}
