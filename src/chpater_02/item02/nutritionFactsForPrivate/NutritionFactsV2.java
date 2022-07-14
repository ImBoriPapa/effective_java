package chpater_02.item02.nutritionFactsForPrivate;

/**
 * 자바빈즈 패턴(JavaBeans pattern)
 */
public class NutritionFactsV2 {
    private  int servingSize = -1;
    private  int servings = -1;
    private  int calories = 0;
    private  int fat = 0;
    private  int sodium = 0;
    private  int carbohydrate = 0;

    public NutritionFactsV2() { }

    public void setServingSize(int val) { servingSize = val;}
    public void setServings(int val)    { servings = val;}
    public void setCalories(int val)    { calories = val;}
    public void setFat(int val)         { fat =val;}
    public void setSodium(int val)      { sodium =val;}
    public void setCarbohydrate(int val){ carbohydrate = val;}

}
