public class Ponto implements Comparable{
    private int x;
    private int y;
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ponto ponto = (Ponto) o;
        return x == ponto.x &&
                y == ponto.y;
    }

    @Override
    public int compareTo(Object o) {
        if(this.getX()>((Ponto)o).getX()) return 1;
        if(this.getX()<((Ponto)o).getX()) return -1;
        if(this.getY()>((Ponto)o).getY()) return 1;
        return -1;
    }
}
