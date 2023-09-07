package game;

public class ChessGame implements GamingConsole{
    public void up(){
        System.out.println("move forward");
    }
    public void down(){
        System.out.println("move backward");
    }
    public void left(){
        System.out.println("move left");
    }
    public void right(){
        System.out.println("move right");
    }
}
