public class ChamadaStateFalta extends ChamadaState {
    private ChamadaStateFalta() {};
    private static ChamadaStateFalta instance = new ChamadaStateFalta();
    public static ChamadaStateFalta getInstance() {
        return instance;
    }

    public String getState() {
        return "Aluno Faltou";
    }

    public boolean terminar(Chamada chamada) {
        chamada.setState(ChamadaStatePendente.getInstance());
        return true;
    }
}
