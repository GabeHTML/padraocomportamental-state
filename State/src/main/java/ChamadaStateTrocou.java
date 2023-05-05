public class ChamadaStateTrocou extends ChamadaState {
    private ChamadaStateTrocou() {};
    private static ChamadaStateTrocou instance = new ChamadaStateTrocou();
    public static ChamadaStateTrocou getInstance() {
        return instance;
    }

    public String getState() {
        return "Trocado";
    }
}
