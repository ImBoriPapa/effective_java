package chpater_02.item03;

public class GwanggaetoTheGreat {
    private static final GwanggaetoTheGreat INSTANCE = new GwanggaetoTheGreat();
    private GwanggaetoTheGreat(){}
    public static GwanggaetoTheGreat getInstance(){return INSTANCE;}

    public void buildGreatEmpire(){
        System.out.println("King Gwanggaeto the Great built a great empire");
    }
}
