package chpater_02.item02.nutritionFactsForPrivate;

/**
 * 빌더 패턴(Builder pattern)
 * API(fluent API)
 * (method chaining)
 */
public class NutritionFactsV3 {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFactsV3(Builder builder) {
        this.servingSize  =  builder.servingSize;
        this.servings     =  builder.servings;
        this.calories     =  builder.calories;
        this.fat          =  builder.fat;
        this.sodium       =  builder.sodium;
        this.carbohydrate =  builder.carbohydrate;
    }

    public static class Builder{
        //필수 매개변수
        private final int servingSize;
        private final int servings;

        //선택 매개변수
        private  int calories       =0;
        private  int fat            =0;
        private  int sodium         =0;
        private  int carbohydrate   =0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val; return this;
        }

        public Builder fat(int val){
            fat = val; return this;
        }

        public Builder sodium(int val){
            sodium = val; return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val; return this;
        }

        public NutritionFactsV3 build() {
            return new NutritionFactsV3(this);
        }
    }


}
