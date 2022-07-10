package chpater_02.item02.userInfo;
/**
 * 점층적 생성자 패턴
 *
 * 필수 매개변수만 받는 생성자
 * 필수 매개변수와 선택 매개변수 1개만 받는 생성자 부터 선택 매개변수를 전부 다 받는 생성자까지 늘려간다.
 *
 */
public class UserInfoV1 {

    private final String name;
    private final int age;
    private final String gender;
    private final String phone;
    private final String email;
    private final MemberShip memberShip;

    public UserInfoV1(String name, int age) {
        this(name, age, null);

    }

    public UserInfoV1(String name, int age, String gender) {
        this(name, age, gender, null);
    }

    public UserInfoV1(String name, int age, String gender, String phone) {
        this(name, age, gender, phone,null);
    }

    public UserInfoV1(String name, int age, String gender, String phone, String email) {
        this(name, age, gender, phone,email,null);
    }

    public UserInfoV1(String name, int age, String gender, String phone, String email, MemberShip memberShip) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.memberShip = memberShip;
    }


}
