package game;

public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("JUMP");
    }
    public void down(){
        System.out.println("Going into a hole.");
    }
    public void left(){
        System.out.println("Going backward");
    }
    public void right(){
        System.out.println("Going forward");
    }
    
}
