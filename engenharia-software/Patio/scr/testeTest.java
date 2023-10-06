import static org.junit.Assert;
import org.junit.Test;

    
public class testeTest {

    @Test
    public void test() {
        Patio patio = new Patio();
        assertEquals(patio.getVeiculos().size(),0);

        patio.cadastrarVeiculo(new Veiculo("aaaiiilll", null, new Especificacao("preto", "suv")));

        assertEquals(patio.getVeiculos().size(),1);
    }

    @Override
    public String toString() {
        return "testeTest []";
    }
}

    