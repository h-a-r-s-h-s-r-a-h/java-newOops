package game;

public class GameRunner {
    public static void main(String[] args){
        // when you comment out chess game and starts mariogame,the mariogame is running with same code.
        //MarioGame game =  new MarioGame();
        ChessGame game = new ChessGame();
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
