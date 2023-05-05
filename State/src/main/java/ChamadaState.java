public abstract class ChamadaState {
    public abstract String getState();

    public boolean cadastrar(Chamada chamada) {
        return false;
    }

    public boolean concluir(Chamada chamada) {
        return false;
    }
    public boolean finalizar(Chamada chamada) { return false; }
    public boolean terminar(Chamada chamada) {
        return false;
    }
    public boolean cancelar(Chamada chamada) {
        return false;
    }
    public boolean trocar(Chamada chamada) {
        return false;
    }
}
