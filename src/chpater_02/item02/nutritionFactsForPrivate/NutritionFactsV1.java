package chpater_02.item02.nutritionFactsForPrivate;

/**
 * 점층적 생성자 패턴
 *
 * 필수 매개변수만 받는 생성자
 * 필수 매개변수와 선택 매개변수 1개만 받는 생성자 부터 선택 매개변수를 전부 다 받는 생성자까지 늘려간다.
 *
 */
public class NutritionFactsV1 {
    private final int servingSize;  //(ml, 1회 제공량)   필수
    private final int servings;     //(회, 총 n회 제공량) 필수
    private final int calories;     //(1회 제공량당)      선택
    private final int fat;          //(g,1회 제공량)      선택
    private final int sodium;       //(mg/1회 제공량)     선택
    private final int carbohydrate; //(g/1회 제공량)      선택

    public NutritionFactsV1(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFactsV1(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFactsV1(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, calories, 0);
    }

    public NutritionFactsV1(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, calories, sodium, 0);
    }

    public NutritionFactsV1(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
