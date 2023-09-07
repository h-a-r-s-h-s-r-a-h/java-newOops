package animal;

public class AnimalRunner {
    public static void main(String[] args){
        Animal[] anim = {new Cat(), new Dog()};
        for(Animal a:anim){
            a.bark();
        }
    }
}
