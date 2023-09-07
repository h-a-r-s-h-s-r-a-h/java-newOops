package recipe;

public class RecipewithMicrowave extends AbstractRecipe {
    public void getReady(){
        System.out.println("Switch on the microwave");
    }
    public void doTheDish(){
        System.out.println("Insert your dish in microwave");
    }
    public void cleanUp(){
        System.out.println("Switch off the microwave");
    }
    
}
