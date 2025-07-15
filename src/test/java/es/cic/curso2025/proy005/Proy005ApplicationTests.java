package es.cic.curso2025.proy005;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;



@SpringBootTest
@AutoConfigureMockMvc
class Proy005ApplicationTests {

	@Autowired
	private MockMvc mockMvc;


	/**
	 * 
	 */
	@Test
	void testTelefonoDelete() throws Exception {
		mockMvc
		.perform(delete("/telefono/4"))
		.andDo(print())
		.andExpect(status().isOk())
		.andReturn();

	}

	@Test
	void testLista(){

		// Manera correcta para asignar el tipo
		ArrayList<String> miLista = new ArrayList<>();
		miLista.add("Hola");
		String mensajeOriginal = miLista.get(0);
	}

}
