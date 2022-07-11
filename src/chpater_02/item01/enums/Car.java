package chpater_02.item01.enums;

public class Car {


    public static void main(String[] args) {

        Drive dir = Drive.FORWARD;

        if(dir == Drive.FORWARD) {
            System.out.println(dir==Drive.FORWARD);
            System.out.println("전진");
        }

        if (dir.equals(Drive.FORWARD)) {
            System.out.println(dir.equals(Drive.FORWARD));
            System.out.println("전진");
        }
    }
}




