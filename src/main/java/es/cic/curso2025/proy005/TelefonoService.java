package es.cic.curso2025.proy005;

import org.springframework.stereotype.Service;



// Este test 
@Service
public class TelefonoService {

  private long contador = 0;

  public long create(Telefono telefono){
    return ++contador;
  }




}
