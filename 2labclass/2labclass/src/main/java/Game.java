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
    private int x=10;
    private int y=10;

    public Game() {
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
        screen.setCharacter(x, y, new TextCharacter('X'));
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
        //Ponto 7 alinea 1
        else if(key.getKeyType() == KeyType.ArrowUp){
            y +=1;
        }
        else if(key.getKeyType() == KeyType.ArrowDown){
            y -=1;
        }
        else if(key.getKeyType() == KeyType.ArrowLeft){
            x -=1;
        }
        else if(key.getKeyType() == KeyType.ArrowRight) {
            x += 1;
        }
        System.out.println(key);
    }
    


}
