import java.util.Scanner;

public class Barman {
    Scanner scan = new Scanner(System.in);

    public Drink createDrink() {

        int numOfIngredients = getNumOfIngredients();
        Ingredient[] ingredients = new Ingredient[numOfIngredients];
        int i = 0;
        while (i < numOfIngredients) {
            Ingredient ingredient = getIngredient();
            ingredients[i] = ingredient;
            i++;
        }
        return new Drink(ingredients, numOfIngredients);
    }


    public Ingredient getIngredient() {
        System.out.println("podaj nazwe składnika");
        String name = scan.nextLine();
        System.out.println("podaj ilosc skladnika");
        double amount = scan.nextDouble();
        scan.nextLine();
        return new Ingredient(name, amount);
    }

    public int getNumOfIngredients() {
        System.out.println("podaj liczbe składnikow");
        int num = scan.nextInt();
        scan.nextLine();
        return num;
    }

    public void printDrink(Drink drink){
        System.out.println("Drink składa się z " + drink.getNumOfIngredients() + " składnikow");

        for (int i = 0; i < drink.getNumOfIngredients() ; i++) {
            System.out.println(drink.getIngredients()[i].getName() +" (" +drink.getIngredients()[i].getAmount() +")" );
        }

    }

}
