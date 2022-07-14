package chpater_02.item05;

import chpater_02.item05.dependencyinjection.FoodRecommender;
import chpater_02.item05.food.JapanFood;
import chpater_02.item05.food.USAFood;

public class Restaurant {
    public static void main(String[] args) {

        FoodRecommender recommendUSAFood = new FoodRecommender(new USAFood());
        FoodRecommender recommendJapanFood = new FoodRecommender(new JapanFood());
    }
}
