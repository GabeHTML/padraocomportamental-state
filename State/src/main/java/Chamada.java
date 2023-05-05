public class Chamada {
    private String nome;
    private ChamadaState state;

    public Chamada() {
        this.state = ChamadaStatePresente.getInstance();
    }

    public void setState(ChamadaState state) {
        this.state = state;
    }

    public boolean cadastrar() {
        return state.cadastrar(this);
    }

    public boolean finalizar() {
        return state.finalizar(this);
    }

    public boolean terminar() {
        return state.terminar(this);
    }

    public boolean cancelar() {
        return state.cancelar(this);
    }

    public boolean concluir() {

        return state.concluir(this);
    }

    public String getNomeState() {

        return state.getState();
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public ChamadaState getState() {

        return state;
    }
}
