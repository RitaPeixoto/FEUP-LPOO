import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Wall {
    private int x;
    private int y;

    public Wall(int x, int y){
        this.x = x;
        this.y=y;
    }

    public void setX(int x){
        this.x=x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY() {
        return y;
    }

    public Position getPosition(){
        return new Position(x,y);
    }
    public void draw(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(x, y), " ");
        graphics.setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));

    }
}
