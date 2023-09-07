package againgame;

public class GameRunner {
    public static void main(String[] args){
        GamingConsole[] games = {new MarioGame(), new ChessGame()};  //polymorphism
        for(GamingConsole c:games){
            c.up();
            c.down();
            c.left();
            c.right();
        }
        
    }
}
