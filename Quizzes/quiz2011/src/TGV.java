public class TGV extends Comboio {
    private ServicoABordo servico;
    public TGV(String nome) {
        super(nome);
        this.servico = new ServicoPrioritario();
    }

    public ServicoABordo getServicoABordo() {
        return servico;
    }

    public String getDescricaoServico(){
        return servico.getDescricaoServico();
    }

    public void setServicoABordo(ServicoABordo servico){
        this.servico =  servico;
    }
    @Override
    public String toString() {
        return "TGV " + getNome()+ ", " + getNumCarruagens() + " carruagem, " + getNumLugares() + " lugar, " + getNumPassageiros() + " passageiros";
    }
}
