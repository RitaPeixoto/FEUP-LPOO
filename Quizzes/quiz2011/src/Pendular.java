public class Pendular extends Comboio{
    private ServicoABordo servico;
    public Pendular(String nome) {
        super(nome);
        this.servico = new ServicoSemEnjoos();
    }

    public ServicoABordo getServicoABordo() {
        return servico;
    }
    @Override
    public void setServicoABordo(ServicoABordo servico){
        this.servico = servico;
    }

    public String getDescricaoServico(){
        return servico.getDescricaoServico();
    }


    @Override
    public String toString() {
        return "Pendular " + getNome()+ ", " + getNumCarruagens() + " carruagem, " + getNumLugares() + " lugar, " + getNumPassageiros() + " passageiros";
    }
}
