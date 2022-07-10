package chpater_02.item02.userInfo;

import static chpater_02.item02.userInfo.GeneralMemberInformation.PeriodOfUse.ONE_MONTH;
import static chpater_02.item02.userInfo.UserInformationManagement.Location.*;

public class Member {
    public static void main(String[] args) {
        //점층적 생성자 패턴(telescoping constructor pattern)
        UserInfoV1 userInfoV1 = new UserInfoV1("이회원", 25, "남성", "01011112222", "user@user.com", MemberShip.WHITE);


        //자바빈즈 패턴(JavaBeans pattern)
        UserInfoV2 userInfoV2 = new UserInfoV2();
        userInfoV2.setName("김회원");
        userInfoV2.setAge(30);
        userInfoV2.setPhone("01923231212");
        userInfoV2.setMemberShip(MemberShip.GOLD);


        //빌더 패턴(Builder pattern)
        UserInfoV3 userInfoV3 = new UserInfoV3.Builder("한회원",25)
                .gender("여성")
                .phone("010-2222-3333")
                .email("han@han.com")
                .memberShip(MemberShip.VIP)
                .build();

        GeneralMemberInformation generalMemberInformation = new GeneralMemberInformation.Builder(ONE_MONTH)
                .setLocation(KOREA)
                .setLocation(USA)
                .build();

        SpecialUserInformation specialUserInformation = new SpecialUserInformation.Builder()
                .setLocation(KOREA)
                .setLocation(USA)
                .setLocation(GERMANY)
                .benefits()
                .build();

    }



}
