public class FiguraComposta extends Figura implements Countable {
    private Figura[] figuras;

    public FiguraComposta(Figura[] figuras){
        this.figuras = figuras;
    }

    @Override
    public double getPerimetro() {
        double res = 0;
        for(Figura f: figuras){
            res += f.getPerimetro();
        }
        return res;
    }

    @Override
    public double getArea() {
        double res = 0;
        for(Figura f: figuras){
            res += f.getArea();
        }
        return res;
    }

    @Override
    public int count() {
        return figuras.length;
    }
}
