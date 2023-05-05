public class ChamadaStatePendente extends ChamadaState {
    private ChamadaStatePendente() {};
    private static ChamadaStatePendente instance = new ChamadaStatePendente();
    public static ChamadaStateFalta getInstance() {
        return instance;
    }

    public String getState() {
        return "Pedido Incompleto";
    }
}
