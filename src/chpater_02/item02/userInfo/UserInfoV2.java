package chpater_02.item02.userInfo;

/**
 * 자바빈즈 패턴(JavaBeans pattern)
 */
public class UserInfoV2 {

    private  String name            ="";
    private  int age                = -1;
    private  String gender          ="";
    private  String phone           ="";
    private  String email           ="";
    private  MemberShip memberShip  = MemberShip.WHITE;

    public UserInfoV2() {}

    public void setName(String val)             { name = val; }
    public void setAge(int val)                 { age  = val; }
    public void setGender(String val)           { gender = val; }
    public void setPhone(String val)            { phone = val; }
    public void setEmail(String val)            { email = val; }
    public void setMemberShip(MemberShip val)   { memberShip = val; }
}
