import java.util.Arrays;

public class Drink {

    private Ingredient [] ingredients;
    private int numOfIngredients;

    public Drink(Ingredient[] ingredients, int numOfIngredients) {
        this.ingredients = ingredients;
        this.numOfIngredients = numOfIngredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getNumOfIngredients() {
        return numOfIngredients;
    }

    public void setNumOfIngredients(int numOfIngredients) {
        this.numOfIngredients = numOfIngredients;
    }


}
