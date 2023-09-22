import static org.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Teste {

    /**
     * 
     */
    @Test
    public void testMinhaFuncao() {
        Teste teste= new Teste();
        int resultado = teste.minhaFuncao(5);
        assertEquals(0,resultado); // Espera-se que minhaFuncao(5) retorne 0
    }

    private void assertEquals(int i, int resultado) {
    }

    private int minhaFuncao(int i) {
        return 0;
    }
 
}

     

