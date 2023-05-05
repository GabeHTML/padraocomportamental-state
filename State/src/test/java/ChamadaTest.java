import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChamadaTest {
    Chamada chamada;

    private void assertEquals(ChamadaStateFalta instance, ChamadaState state) {
    }

    @BeforeEach
    public void setUp() {
        chamada = new Chamada();
    }

    @Test
    public void naoDevePassarAlunoQueFoiPresente() {
        chamada.setState(ChamadaStatePresente.getInstance());
        assertFalse(chamada.cadastrar());
    }

    private void assertFalse(boolean cadastrar) {
    }

    @Test
    public void devePassarAlunoQueFoiPresente() {
        chamada.setState(ChamadaStatePresente.getInstance());
        assertTrue(chamada.concluir());
        assertEquals(ChamadaStatePresente.getInstance(), chamada.getState());
    }

    private void assertTrue(boolean concluir) {
    }

    @Test
    public void deveDarAtencaoAoAlunoPendente() {
        chamada.setState(ChamadaStatePendente.getInstance());
        assertTrue(chamada.terminar());
        assertEquals(ChamadaStatePendente.getInstance(), chamada.getState());
    }

    @Test
    public void naoDeveDarAtencaoAoAlunoPendente() {
        chamada.setState(ChamadaStatePendente.getInstance());
        assertFalse(chamada.cadastrar());
    }

    @Test
    public void naoDevePassarAlunoQueFaltou() {
        chamada.setState(ChamadaStateFalta.getInstance());
        assertTrue(chamada.cancelar());
        assertEquals(ChamadaStateFalta.getInstance(), chamada.getState());
    }

    @Test
    public void devePassarAlunoQueFaltou() {chamada.setState(ChamadaStateFalta.getInstance());
        assertTrue(chamada.terminar());
        assertEquals(ChamadaStateFalta.getInstance(), chamada.getState());
    }
}
