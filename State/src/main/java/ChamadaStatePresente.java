public class ChamadaStatePresente extends ChamadaState {
    private ChamadaStatePresente() {};
    private static ChamadaStatePresente instance = new ChamadaStatePresente();
    public static ChamadaStateFalta getInstance() {
        return instance;
    }

    public String getState() {
        return "Aluno Presente";
    }

    public boolean finalizar(Chamada chamada) {
        chamada.setState(ChamadaStateFinalizado.getInstance());
        return true;
    }

    public boolean concluir(Chamada chamada) {
        chamada.setState(ChamadaStateConcluido.getInstance());
        return true;
    }

    public boolean terminar(Chamada chamada) {
        chamada.setState(ChamadaStatePendente.getInstance());
        return true;
    }

    public boolean cancelar(Chamada chamada) {
        chamada.setState(ChamadaStateFalta.getInstance());
        return true;
    }

    public boolean trocar(Chamada chamada) {
        chamada.setState(ChamadaStateTrocou.getInstance());
        return true;
    }
}
