package thtrienkhaitemplatemethod;

public class TacoMeal extends Meal {
    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and shells");
    }

    @Override
    public void eat() {
        System.out.println("The tacos are tasty");
    }
}
