package chpater_02.item02.userInfo;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class UserInformationManagement {
    public enum Location{ KOREA,JAPAN,USA,UK,GERMANY }
    final Set<Location> locations;

    abstract static class Builder<T extends  Builder<T>>{
    EnumSet<Location> locations = EnumSet.noneOf(Location.class);

    public T setLocation(Location location) {
        locations.add(Objects.requireNonNull(location));
        return self();
    }

    abstract UserInformationManagement build();

    //하윈 클래스는 이 메서드를 재정의(overriding) 하여 "this"를 해야 한다.
    protected abstract T self();
        }

        UserInformationManagement(Builder<?> builder){
            locations = builder.locations.clone();
        }

}
