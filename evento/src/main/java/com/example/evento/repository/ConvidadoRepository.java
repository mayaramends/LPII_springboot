package com.example.evento.repository;

import com.example.evento.models.Convidado;
import com.example.evento.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);
}
