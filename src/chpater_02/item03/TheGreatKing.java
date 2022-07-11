package chpater_02.item03;

import java.lang.reflect.AccessibleObject;

public class TheGreatKing {
    public static void main(String[] args) {

        KingSejongTheGreat kingSejongTheGreat = KingSejongTheGreat.INSTANCE;
        kingSejongTheGreat.makeHangeul();

        GwanggaetoTheGreat gwanggaetoTheGreat = GwanggaetoTheGreat.getInstance();
        gwanggaetoTheGreat.buildGreatEmpire();

        LeeSeongGyeTheFoundingKingOfJoseon leeSeongGyeTheFoundingKingOfJoseon = LeeSeongGyeTheFoundingKingOfJoseon.INSTANCE;
        leeSeongGyeTheFoundingKingOfJoseon.foundingJoseon();
    }
}
