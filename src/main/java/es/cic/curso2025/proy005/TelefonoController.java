package es.cic.curso2025.proy005;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {

    private int contador = 0;

    // C R U D

    @PostMapping
    public long create(@RequestBody Telefono telefono){
        return ++contador;


    }

    @GetMapping
    public List<Telefono> get(){
        // Simular que devuelve una lista de telf
        List<Telefono> resultado = new ArrayList<>();

        Telefono telefono1 = new Telefono();
        telefono1.setId(1);
        telefono1.setNumero("54");
        telefono1.setTipoContrato(2);
        telefono1.setTitular("Héctor");
        
        resultado.add(telefono1);


        Telefono telefono2 = new Telefono();
        telefono2.setId(2);
        telefono2.setNumero("43");
        telefono2.setTipoContrato(1);
        telefono2.setTitular("Solana");
        
        resultado.add(telefono2);


        return resultado ;
    }


    @GetMapping("{id}")
    public Telefono get(@PathVariable long id){

        Telefono telefono1 = new Telefono();
        telefono1.setId(id);
        telefono1.setNumero("54");
        telefono1.setTipoContrato(2);
        telefono1.setTitular("Hector");
        
      return telefono1;
    }

    @PutMapping
    public void update (@RequestBody Telefono telefono) {
        // TODO
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        contador = contador;
    }


}
