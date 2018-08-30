import com.company.ConversaoUnidade;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversaoUnidadeTest {

    @Test
    public void testCelsiusFarenheit(){
        double valor1 = 25;
        double resultado = ConversaoUnidade.conversorCelsiusFarenheit(valor1);
        assertEquals(32, resultado,0.01);
    }

    @Test
    public void testQuilometroHoraMetroSegundo(){
        double valor1 = 80;
        double resultado = ConversaoUnidade.conversorQuilometroHoraMetroSegundo(valor1);
        assertEquals(20,resultado,0.01);
    }

    @Test
    public void testMetroQuilometro(){
        double valor1 = 1500;
        double resultado = ConversaoUnidade.conversorMetroQuilometro(valor1);
        assertEquals(1,resultado,0.01);
    }

    @Test
    public void testMinutoDia(){
        double valor1 = 6600;
        double resultado = ConversaoUnidade.conversorMinutoDia(valor1);
        assertEquals(3,resultado,0.01);
    }

}
