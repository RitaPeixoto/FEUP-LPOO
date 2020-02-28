import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
    private Screen screen;
    private int x;
    private int y;
    private Hero hero;
    public Game() {
        hero = new Hero(10,10);
        try {

            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            screen = new TerminalScreen(terminal);

            screen.setCursorPosition(null);   // we don't need a cursor
            screen.startScreen();             // screens must be started
            screen.doResizeIfNecessary();     // resize screen if necessary

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void draw() throws IOException {
        screen.clear();
        hero.draw(screen);
        screen.refresh();
    }
    public void run() throws IOException {
        while(true){
            draw();
            KeyStroke key = screen.readInput();
            processKey(key);
            if(key.getKeyType() == KeyType.EOF) {
                break;
            }
        }

    }
    private void processKey(KeyStroke key){
        if(key.getKeyType()== KeyType.Character && key.getCharacter()=='q'){
            try {
                screen.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(key.getKeyType() == KeyType.ArrowUp){
            hero.moveUp();
        }
        else if(key.getKeyType() == KeyType.ArrowDown){
            hero.moveDown();
        }
        else if(key.getKeyType() == KeyType.ArrowLeft){
            hero.moveLeft();
        }
        else if(key.getKeyType() == KeyType.ArrowRight) {
            hero.moveRight();
        }
        System.out.println(key);
    }
    


}
