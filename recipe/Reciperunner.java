package recipe;

public class Reciperunner {
    public static void main(String[] args) {
        Recipe1 recipe = new Recipe1();
        recipe.execute();
        System.out.println();
        RecipewithMicrowave machine = new RecipewithMicrowave();
        machine.execute();
        
    }
}
