package chpater_02.item02.userInfo;
/**
 * 빌더 패턴(Builder pattern)
 * API(fluent API)
 * (method chaining)
 */
public class UserInfoV3 {

    private final String name;
    private final int age;
    private final String gender;
    private final String phone;
    private final String email;
    private final MemberShip memberShip;

    public UserInfoV3(Builder builder) {
        this.name =builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.phone = builder.phone;
        this.email = builder.email;
        this.memberShip = builder.memberShip;
    }

    public static class Builder{
       //필수 매개변수
       private final String name;
       private final int age;

       //선택 매개변수
       private  String gender = "";
       private  String phone  = "";;
       private  String email  = "";;
       private  MemberShip memberShip = MemberShip.WHITE;

       public Builder(String name, int age){
           this.name = name;
           this.age = age;
       }

       public Builder gender(String val){
           gender = val; return this;
       }

       public Builder phone(String val){
           phone = val; return this;
       }

       public Builder email(String val){
           email = val; return this;
       }

       public Builder memberShip(MemberShip val){
           memberShip = val; return this;
       }

       public UserInfoV3 build(){
           return new UserInfoV3(this);
       }
   }


}
