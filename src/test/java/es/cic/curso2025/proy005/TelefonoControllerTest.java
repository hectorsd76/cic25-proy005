package es.cic.curso2025.proy005;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TelefonoControllerTest {

    // Esta anotación conecta con spring que nos inicializa el objeto TelefonoController en este caso
    @Autowired
    private TelefonoController telefonoController;

    
    @Test
    public void testCreate(){
        long resultadoId = telefonoController.create(null);
        assertTrue(resultadoId > 0);
    }
}
