package thtrienkhaitemplatemethod;

    public abstract class Meal {
    public final void doMeal(){
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    public void eat(){
        System.out.println("Mmm, that's good");
    }

    public abstract void cleanUp();

    public abstract void cook();

    public abstract void prepareIngredients();
}
