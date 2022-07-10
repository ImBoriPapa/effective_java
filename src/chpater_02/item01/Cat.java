package chpater_02.item01;

public class Cat {
    private String name;
    private int age;
    private Gender gender;
    private boolean vaccination; //예방접종 여부
    private boolean modified;// 정보 수정 여부

    public Cat() {}

    public Cat(String name, int age, Gender gender, boolean vaccination) {//등록
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.vaccination = vaccination;
    }

    public Cat( boolean modified, String name, int age, Gender gender) {//수정
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.modified = modified;
    }

    private static final Cat CAT = new Cat();

    public static final Cat registerNewCat(){ //등록 기능
        return CAT;
    };

    public static final Cat modifiedCatRegistration(Cat cat,boolean modified){//수정 기능
        Cat registerNewCat = Cat.registerNewCat();
        cat.name = cat.name;
        cat.age = cat.age;
        cat.gender = cat.gender;
        cat.vaccination = cat.vaccination;
        cat.modified = modified;
        return registerNewCat;
    };
}
