import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {
    private int width;
    private int height;
    private Hero hero;
    private List<Wall> walls;
    private List<Coin> coins;
    private List<Monster> monsters;
    private Position lastHero;

    public  Arena(int width, int height){
        this.width = width;
        this.height = height;
        hero = new Hero(10,10);
        this.walls = createWalls();
        this.coins = createCoins();
        this.monsters = createMonsters();
    }

    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }

        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }

        return walls;
    }

    private List<Coin> createCoins() {
        Random random = new Random();
        boolean exists=false;
        Coin aux;
        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            aux = new Coin(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1);
            if(aux.getPosition().equals(hero.getPosition())){
                i--;
                continue;
            }
            else{
                coins.add(aux);
            }

        }

        return coins;
    }

    private List<Monster> createMonsters() {
        Random random = new Random();
        ArrayList<Monster> monsters = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            monsters.add(new Monster(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1));
        return monsters;
    }

    public  void draw(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#bb00ff"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');
        for (Wall wall : walls)
            wall.draw(graphics);
        for(Coin coin : coins)
            coin.draw(graphics);
        for(Monster monster: monsters)
            monster.draw(graphics);
        hero.draw(graphics);

    }

    public void processKey(KeyStroke key){
        lastHero = hero.getPosition();
        moveMonsters();
        if(key.getKeyType() == KeyType.ArrowUp){
            moveHero(hero.moveUp());
        }
        else if(key.getKeyType() == KeyType.ArrowDown){
            moveHero(hero.moveDown());
        }
        else if(key.getKeyType() == KeyType.ArrowLeft){
            moveHero(hero.moveLeft());
        }
        else if(key.getKeyType() == KeyType.ArrowRight) {
            moveHero(hero.moveRight());
        }
        System.out.println(key);
    }

    private void moveHero(Position position) {
        if(canMoveHero(position)){
            hero.setPosition(position);
            for(Coin coin: coins)
                if(coin.getPosition().equals(position)){
                    retrieveCoins(position);
                    break;
                }
        }
    }

    private boolean canMoveHero(Position position){
        if(position.getX()>=0 && position.getX()<width && position.getY()>=0 && position.getY()<height){
            for(Wall wall : walls){
                if(wall.getPosition().equals(position)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    private boolean canMoveMonster(Position position){
        if(position.getX()>=0 && position.getX()<width && position.getY()>=0 && position.getY()<height){
            for(Wall wall : walls){
                if(wall.getPosition().equals(position)){
                    return false;
                }
            }
            for(Coin coin: coins){
                if(coin.getPosition().equals(position)){
                    return false;
                }
            }
            for(Monster monster: monsters)
                if(monster.getPosition().equals(position))
                    return false;
            return true;
        }
        return false;
    }


    private void retrieveCoins(Position position){
        for (int i = 0; i < coins.size(); i++) {
            if (coins.get(i).getPosition().equals(position)) {
                coins.remove(i);
                break;
            }
        }
    }

    private void moveMonsters(){
        Position next;
        for(Monster monster: monsters){
            next = monster.move();
            if(canMoveMonster(next))
                monster.setPosition(next);
        }

    }

    public boolean verifyMonsterCollisions(){
        for (Monster monster: monsters){
            if((monster.getPosition().equals(hero.getPosition())) ||(monster.getPosition().equals(lastHero)) ){
                if(hero.getEnergy()==0){
                    System.out.println("You've just got eaten by the monster!");
                    return true;
                }
                else{
                    hero.setEnergy(hero.getEnergy()-1);
                    return false;
                }
            }
        }
        return false;
    }

    public boolean wonGame(){
        if(coins.isEmpty()){
            System.out.println("You've just won the game!");
            return true;
        }
        return false;
    }
}
