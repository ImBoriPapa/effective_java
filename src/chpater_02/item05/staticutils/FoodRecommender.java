package chpater_02.item05.staticutils;

import chpater_02.item05.food.KoreanFood;


import java.util.List;

public class FoodRecommender {

    private static final KoreanFood koreanFood = new KoreanFood();

    private FoodRecommender() {
    }

    public static boolean isValid(String foodName) {

        return koreanFood.contains(foodName);
    }

    public static List<String> suggestion(String foodName) {

        return koreanFood.closeWordsTo(foodName);
    }
}
