import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Comboio{
    private String nome;
    private ArrayList<Carruagem> carruagens;
    private int passageiros;
    private int lugaresLivres;
    private ServicoABordo servico;

    public Comboio(String nome) {
        this.nome = nome;
        this.carruagens = new ArrayList<>();
        this.passageiros = 0;
        this.lugaresLivres = 0;
        this.servico = new ServicoRegular();
    }
    public void setCarruagens(ArrayList<Carruagem>carruagens){
        this.carruagens = carruagens;
        for(Carruagem c: carruagens){
            lugaresLivres += c.getNumLugares();
        }
    }

    public String getNome() {
        return nome;
    }
    public int getNumLugares(){
        int res = 0;
        for(Carruagem c: carruagens){
            res += c.getNumLugares();
        }
        return res;
    }
    public Carruagem getCarruagemByOrder(int index){
        return carruagens.get(index);
    }
    public int getNumCarruagens(){
        return carruagens.size();
    }
    public void addCarruagem(Carruagem c){
        carruagens.add(c);
        lugaresLivres += c.getNumLugares();
    }
    public void removeAllCarruagens(int capacity){
        ArrayList<Carruagem> res = new ArrayList<>();
        for(Carruagem c: carruagens){
            if(c.getNumLugares() != capacity){
                res.add(c);
            }
        }
        this.setCarruagens(res);
    }
    public void addPassageiros(int n) throws PassengerCapacityExceeded{
        if(n > lugaresLivres) throw new PassengerCapacityExceeded();
        passageiros += n;
        lugaresLivres -= n;
    }
    public void removePassageiros(int n){
        passageiros -= n;
        lugaresLivres += n;
    }
    public void removePassageiros(){
        passageiros = 0;
        lugaresLivres += passageiros;
    }

    public int getNumPassageiros() {
        return passageiros;
    }

    public int getLugaresLivres() {
        return lugaresLivres;
    }

    public void setServicoABordo(ServicoABordo servico){
        this.servico = servico;
    }

    public ServicoABordo getServicoABordo(){
        return servico;
    }

    public String getDescricaoServico(){
        return servico.getDescricaoServico();
    }

    @Override
    public String toString() {
        return "Comboio "+ getNome() + ", " + getNumCarruagens() + " carruagens, " + getNumLugares() + " lugares, " + getNumPassageiros() + " passageiros";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comboio comboio = (Comboio) o;
        return Objects.equals(carruagens, comboio.carruagens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, carruagens, passageiros, lugaresLivres);
    }
}
