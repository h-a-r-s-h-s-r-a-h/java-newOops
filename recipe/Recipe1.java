package recipe;

public class Recipe1 extends AbstractRecipe{
    public void getReady(){
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils.");
    }

    public void doTheDish(){
        System.out.println("do the dish");
    }

    public void cleanUp(){
        System.out.println("clean up the utensils.");
    }
    
}
