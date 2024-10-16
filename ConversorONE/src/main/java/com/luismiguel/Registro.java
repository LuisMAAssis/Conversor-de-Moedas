package com.luismiguel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Registro {
  List<RegistroDTO> registros = new ArrayList<>();
  public void registrarLog(String pesquisa) {
    LocalDateTime exatoMomento = LocalDateTime.now();
    RegistroDTO data = new RegistroDTO(pesquisa, exatoMomento);
    registros.add(data);
  }

  public void exibirHistorico() {
    registros.forEach(System.out::println);
  }
}
