package chpater_02.item02.nutritionFactsForPrivate;

import static chpater_02.item02.nutritionFactsForPrivate.NyPizza.Size.*;
import static chpater_02.item02.nutritionFactsForPrivate.Pizza.Topping.*;

public class Pasta {
    public static void main(String[] args) {

        NutritionFactsV1 nutritionFactsTelescopingConstructorPattern = new NutritionFactsV1(204,12,10,23,28,0);


        NutritionFactsV2 nutritionFactsJavaBeansPattern = new NutritionFactsV2();
        nutritionFactsJavaBeansPattern.setServingSize(240);
        nutritionFactsJavaBeansPattern.setServings(9);
        nutritionFactsJavaBeansPattern.setCalories(100);


        NutritionFactsV3 nutritionFactsBuilderPattern= new NutritionFactsV3.Builder(240,9)
                .calories(100).sodium(35).carbohydrate(27).build();


        NyPizza nyPizza = (NyPizza) new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        System.out.println("nyPizza = " + nyPizza);
        System.out.println("calzone = " + calzone);
    }
}
