package one.digitalinovation;


// import org.junit.jupiter.api.Assertions; import padrao, que usa Assertions.(metodos)
import static org.junit.jupiter.api.Assertions.*; // melhor forma, assim não é necessário a repetição de "Assertions"
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void calcularIdadeCorretamente() {
        Pessoa pedro = new Pessoa("Pedro", LocalDateTime.of(2005, 3, 9, 20, 10));
        assertEquals(19, pedro.getIdade());
    }

    @Test
    void retornarMaiorIdade() {
        Pessoa pedro = new Pessoa("Pedro", LocalDateTime.of(2005, 3, 9, 20, 10));
        assertTrue(pedro.ehMaiorDeIdade());

        Pessoa nathan = new Pessoa("Nathan", LocalDateTime.of(2010, 4, 10, 13, 10));
        assertFalse(nathan.ehMaiorDeIdade()); // Ou seja, espera-se que retorne false, por isso assertFalse.
    }
}
