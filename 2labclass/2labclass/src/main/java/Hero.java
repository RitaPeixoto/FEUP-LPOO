import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    private int getY() {
        return y;
    }

    private int getX() {
        return x;
    }

    public Hero(int x, int y){
        this.x= x;
        this.y =y;
    }



    public  void draw(Screen screen){
        screen.setCharacter(x, y, new TextCharacter('X'));
    }

    public void moveUp(){
        setY(getY()-1);
    }
    public void moveDown(){
        setY(getY()+1);
    }
    public void moveLeft(){
        setX(getX()-1);
    }
    public void moveRight(){
        setX(getX()+1);
    }

}
