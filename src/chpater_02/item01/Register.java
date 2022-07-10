package chpater_02.item01;

import java.util.ServiceLoader;

public class Register {

    public static void main(String[] args) {

        ServiceLoader<Dog> loader = ServiceLoader.load(Dog.class);

    }

}
