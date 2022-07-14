package chpater_02.item05.dependencyinjection;

import chpater_02.item05.food.Food;



import java.util.List;

public class FoodRecommender {

    private final Food food;

    public FoodRecommender(Food food) {
        this.food = food;
    }

    public boolean isValid(String foodName) {
        return food.contains(foodName);
    }

    public List<String> suggestion(String foodName) {
        return food.closeWordsTo(foodName);
    }
}
